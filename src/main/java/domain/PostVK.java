package domain;

import org.w3c.dom.Text;

public class PostVK {

    private int id;
    private int ownerId;
    private int replyOwnerId;
    private int replyPostId;
    private int fromId;
    private String text;
    private String date;
    private int time;
    private String namePost;
    private String postType;
    private String imageUrl;
    private int friendsOnly;
    private Likes likes;
    private CommentsInfo commentsInfo;
    private RepostsPost repostsPost;
    private ViewsInfo viewsInfo;
    private Copyright copyright;
    private Geo geo;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private boolean isFavorite;
    private Donut donut;

}
