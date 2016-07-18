package com.makarand.threads;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreads {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = null;
		try{
			executorService = Executors.newSingleThreadExecutor();
			
			System.out.println("Starting");
			executorService.execute(() -> System.out.println("Printing zoo inventory"));
			executorService.execute(() -> {
				for (int i =0; i<4 ; i++) {
					System.out.println("Printing record : "+i);
				}
			});
			
			executorService.execute(() -> System.out.println("Printing zoo inventory"));
			executorService.submit(() -> System.out.println("Submitting task "));
						
			Collection<Callable<String>> calls = Collections.emptyList();
			executorService.invokeAll(calls);
			//executorService.invokeAny(calls);
			
			Future<String> submit = executorService.submit(() -> "Future returned");
			System.out.println(submit.get());
			System.out.println("End");
			
		}finally{
			if(executorService != null){
				executorService.shutdown();
				//executorService.execute(() -> System.out.println("Printing zoo inventory"));
			}
		}

	}

}
