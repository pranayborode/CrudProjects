package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.dao.MovieDaoImpl;
import com.pojo.Movie;

public class MovieTest {

	public static void main(String[] args) {

		int id;
		String name;
		int rating;

		int choice;
		char ch;
		Movie movie = null;

		MovieDaoImpl mdao = new MovieDaoImpl();
		List<Movie> mList = new ArrayList<Movie>();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("-----------Movie------------");
			System.out.println("----------------------------");
			System.out.println("1. Add Movie");
			System.out.println("2. Update Movie");
			System.out.println("3. Delete Movie");
			System.out.println("4. Show Movie List");
			System.out.println("5. Search Movie By Id");
			System.out.println("----------------------------");

			System.out.println("Enter Your Choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("---Add Movie---");
				System.out.println("How many Movies do you want to add in list ?");
				int num = sc.nextInt();

				for (int i = 1; i <= num; i++) {

					System.out.println("Enter Movie Id:");
					id = sc.nextInt();

					System.out.println("Enter Movie Name:");
					name = sc.next();

					System.out.println("Enter Movie Rating");
					rating = sc.nextInt();

					movie = new Movie(id, name, rating);

					mdao.addMovie(movie);

				}
				break;

			case 2:
				System.out.println("----Update Movie----");

				System.out.println("Enter Movie Id:");
				id = sc.nextInt();

				System.out.println("Enter Movie name:");
				name = sc.next();

				System.out.println("Enter Movie Rating");
				rating = sc.nextInt();

				movie = new Movie(id, name, rating);

				mdao.updateMovie(movie);
				break;

			case 3:
				System.out.println("-----Delete Movie-----");
				
				System.out.println("Enter Movie Id");
				id = sc.nextInt();

				mdao.deleteMovie(id);
				break;

			case 4:
				System.out.println("--------Movie List---------");
				
				mList = mdao.showAll();

				if (!mList.isEmpty()) {
					System.out.println("Movie List");

					for (Movie m1 : mList) {
						System.out.println(m1);
					}
				} else {
					System.out.println("No list Found");
				}
				break;

			case 5:
				System.out.println("----Search Movie----");
				System.out.println("Enter Movie Id");
				id = sc.nextInt();

				movie = mdao.searchMovieById(id);

				if (movie != null) {
					System.out.println("Movie Found");
					System.out.println(movie);
				} else {
					System.out.println("Movie Not Present");
				}
				break;

			}

			System.out.println("Do you want to Continue ?");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}
