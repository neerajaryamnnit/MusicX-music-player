package com.rks.musicx.interfaces;

import com.rks.musicx.data.model.Song;

import java.util.List;

/*
 * Created by Coolalien on 6/28/2016.
 */

/*
 * ©2017 Rajneesh Singh
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public interface MetaDatas {

    void onSongSelected(List<Song> songList, int pos);

    void onShuffleRequested(List<Song> songList, boolean play);

    void addToQueue(Song song);

    void setAsNextTrack(Song song);

}
