package com.cybage.watchservice;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;

import static java.nio.file.StandardWatchEventKinds.*;

public class WatchServiceClass {
	
	/* public static void main(String[] args) {
        WatchServiceClass watchService
          = (WatchServiceClass) FileSystems.getDefault().newWatchService();

        Path path = Paths.get(System.getProperty("D:\\Training\\Temp"));

        path.register(
          watchService,           
            ENTRY_CREATE);

        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println(
                  "Event kind:" + event.kind() 
                    + ". File affected: " + event.context() + ".");
            }
            key.reset();
        }
    }*/

}
