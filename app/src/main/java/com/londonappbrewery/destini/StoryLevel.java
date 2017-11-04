package com.londonappbrewery.destini;

/**
 * Created by rgehlis on 04.11.2017.
 */

public class StoryLevel {

    private int mStoryTextID;
    private int mAnswerTop;
    private int mAnswerBottom;

    public StoryLevel(int storyResourceStringID){
        this.mStoryTextID = storyResourceStringID;
    }

    public StoryLevel(int storyResourceStringID, int answerTopID, int answerBottomID){
        this.mStoryTextID = storyResourceStringID;
        this.mAnswerTop = answerTopID;
        this.mAnswerBottom = answerBottomID;
    }

    public int getmStoryTextID() {
        return mStoryTextID;
    }

    public int getmAnswerTop() {
        return mAnswerTop;
    }

    public int getmAnswerBottom() {
        return mAnswerBottom;
    }

    public void setmStoryTextID(int mStoryTextID) {
        this.mStoryTextID = mStoryTextID;
    }

    public void setmAnswerTop(int mAnswerTop) {
        this.mAnswerTop = mAnswerTop;
    }

    public void setmAnswerBottom(int mAnswerBottom) {
        this.mAnswerBottom = mAnswerBottom;
    }
}
