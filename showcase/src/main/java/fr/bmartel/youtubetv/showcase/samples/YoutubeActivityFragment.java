package fr.bmartel.youtubetv.showcase.samples;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import fr.bmartel.youtubetv.YoutubeTvFragment;
import fr.bmartel.youtubetv.showcase.R;

/**
 * Created by akinaru on 03/11/16.
 */
public class YoutubeActivityFragment extends Activity {

    private YoutubeTvFragment mYtFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment);

        FragmentTransaction fTransaction = getFragmentManager().beginTransaction();

        Bundle args = new Bundle();
        args.putString("videoId", "gdgHZi347hU");
        args.putString("videoQuality", "hd1080");
        args.putBoolean("showRelatedVideos", false);

        mYtFragment = YoutubeTvFragment.newInstance(args);
        fTransaction.replace(R.id.youtube_fragment, mYtFragment);
        fTransaction.commit();
        requestVisibleBehind(true);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mYtFragment.closePlayer();
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        requestVisibleBehind(true);
    }
}