/*
 * Copyright 2010 Andrew Shu
 *
 * This file is part of "reddit is fun".
 *
 * "reddit is fun" is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * "reddit is fun" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with "reddit is fun".  If not, see <http://www.gnu.org/licenses/>.
 */
package com.andrewshu.android.redditdonation;

import android.os.AsyncTask;

/**
 * AsyncTask template for actions that we send data and don't care about response at all.
 * 
 * - Voting
 * - Hiding threads
 *
 *
 */
/**
 * AsyncTask template for actions that we send data and do care about errors in the response
 * but otherwise don't care about response. We can make a UI update with the info we have.
 * 
 * - Comment replies
 * - Sending messages from inbox
 * - Editing comment or selftext
 * - Deleting
 * - Marking inbox messages read
 */
/**
 * AsyncTask template for actions that we send data and care about response so we can
 * make a UI update.
 * 
 * - Submitting a link
 */

public abstract class SubmitTask extends AsyncTask<Void, Void, Boolean> {

}
