package org.wordpress.android.ui.comments;

public class CommentActionResult {

    public static int COMMENT_ID_ON_ERRORS = -1;
    public static int COMMENT_ID_UNKNOWN = -2;

    long mCommentID = COMMENT_ID_UNKNOWN;
    String mMessage;

    public CommentActionResult(long commentID, String message) {
        mCommentID = commentID;
        mMessage = message;
    }

    public long getCommentID() { return mCommentID; }
    public String getMessage() { return mMessage; }
    public boolean isSuccess() { return mCommentID != COMMENT_ID_ON_ERRORS; }
}
