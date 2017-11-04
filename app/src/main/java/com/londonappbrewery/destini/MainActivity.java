package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mStoryText;
    private Button mAnswerButtonTop;
    private Button mAnswerButtonBottom;

    // Array filled with the story levels
    private final StoryLevel[] mStoryPool = new StoryLevel[]{
            new StoryLevel(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StoryLevel(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StoryLevel(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new StoryLevel(R.string.T4_End),
            new StoryLevel(R.string.T5_End),
            new StoryLevel(R.string.T6_End)
    }
    ;

    private int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryIndex = 1;
        // Wires up the views from the layout to the member variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mAnswerButtonTop = (Button) findViewById(R.id.buttonTop);
        mAnswerButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // Listener for the top button
        mAnswerButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mAnswerButtonTop.getText().equals(getString(R.string.T1_Ans1))){
                    mStoryIndex = 3;
                } else if(mAnswerButtonTop.getText().equals(getString(R.string.T2_Ans1))) {
                    mStoryIndex = 3;
                } else if(mAnswerButtonTop.getText().equals(getString(R.string.T3_Ans1))){
                    mStoryIndex = 6;
                }
                updateStoryText(mStoryIndex - 1);
                updateAnswerButtons(mStoryIndex - 1);

            }
        });

        // Listener for the bottom button
        mAnswerButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mAnswerButtonBottom.getText().equals(getString(R.string.T1_Ans2))){
                    mStoryIndex = 2;
                } else if(mAnswerButtonBottom.getText().equals(getString(R.string.T2_Ans2))){
                    mStoryIndex = 4;
                } else if(mAnswerButtonBottom.getText().equals(getString(R.string.T3_Ans2))){
                    mStoryIndex = 5;
                }
                updateStoryText(mStoryIndex - 1);
                updateAnswerButtons(mStoryIndex - 1);
            }
        });

    }

    public void updateStoryText(int storyIndex){
        mStoryText.setText(mStoryPool[storyIndex].getmStoryTextID());
    }

    public void updateAnswerButtons(int storyIndex){
        if(storyIndex < 3){ // storyIndex = 3 -> Ending_Text_4
            mAnswerButtonTop.setText(mStoryPool[storyIndex].getmAnswerTop());
            mAnswerButtonBottom.setText(mStoryPool[storyIndex].getmAnswerBottom());
        } else{
            mAnswerButtonTop.setVisibility(View.GONE);
            mAnswerButtonBottom.setVisibility(View.GONE);
        }
    }


}
