package com.tmt.TaskManagementTool;
import java.util.*;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagementToolApplication {

	public static void main(String[] args) {


		class NthDuplicateFinder {
			@org.jetbrains.annotations.Nullable
			public static <T> T findNthDuplicate(@NotNull List<T> list, int n) {
				Map<T, Integer> countMap = new HashMap<>();
				List<T> duplicates = new ArrayList<>();

				for (T item : list) {
					// Track occurrences of each element
					countMap.put(item, countMap.getOrDefault(item, 0) + 1);

					// Check if it's a duplicate
					if (countMap.get(item) == 2) { // First duplicate occurrence
						duplicates.add(item);
					}

					// Stop if nth duplicate is found
					if (duplicates.size() == n) {
						return duplicates.get(n - 1);
					}
				}

				// Return null if nth duplicate does not exist
				return null;
			}

			public static void main(String[] args) {
				List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 5, 6, 2, 3, 7, 1);
				int n = 2;
				Integer result = findNthDuplicate(list, n);

				if (result != null) {
					System.out.println("The " + n + "th duplicate element is: " + result);
				} else {
					System.out.println("No " + n + "th duplicate element found.");
				}
			}
		}
	}

}
