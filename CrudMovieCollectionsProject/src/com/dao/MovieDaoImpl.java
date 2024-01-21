package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Movie;

public class MovieDaoImpl implements MovieDao {

	List<Movie> mlist = null;
	Movie mobj = null;

	public MovieDaoImpl() {
		mlist = new ArrayList<Movie>();
	}

	@Override
	public void addMovie(Movie movie) {

		mlist.add(movie);

	}

	@Override
	public void updateMovie(Movie movie) {
		for (int i = 0; i < mlist.size(); i++) {

			if (mlist.get(i).getId() == movie.getId()) {
				mlist.set(i, movie);
			}
		}

	}

	@Override
	public void deleteMovie(int mid) {

		mobj = searchMovieById(mid);

		if (mobj != null) {

			for (int i = 0; i < mlist.size(); i++) {

				if (mlist.get(i).getId() == mid) {
					mlist.remove(i);
					break;
				}
			}
		}else {
			System.out.println("No Record of Movie Found");
		}

	}

	@Override
	public List<Movie> showAll() {

		return mlist;
	}

	@Override
	public Movie searchMovieById(int mid) {

		mobj = null;

		for (int i = 0; i < mlist.size(); i++) {

			if (mlist.get(i).getId() == mid) {

				mobj = mlist.get(i);
				break;
			}
		}
		return mobj;
	}

}
