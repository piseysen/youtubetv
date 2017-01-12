/*
 * The MIT License (MIT)
 * <p/>
 * Copyright (c) 2016 Bertrand Martel
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package fr.bmartel.youtubetv.showcase.samples;

import android.app.Activity;
import android.os.Bundle;

import fr.bmartel.youtubetv.YoutubeTvView;
import fr.bmartel.youtubetv.showcase.R;

/**
 * Created by bertrandmartel on 04/11/16.
 */
public class YoutubeTvViewSplitted extends Activity {

    private YoutubeTvView mYoutubeView1;
    private YoutubeTvView mYoutubeView2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splitted);

        mYoutubeView1 = (YoutubeTvView) findViewById(R.id.youtube_video1);
        mYoutubeView2 = (YoutubeTvView) findViewById(R.id.youtube_video2);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mYoutubeView1.closePlayer();
        mYoutubeView2.closePlayer();
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();

    }
}
