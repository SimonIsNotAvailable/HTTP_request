import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {

    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upVotes;

    public Post(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upVotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upVotes = upVotes;
    }

    @Override
    public String toString() {
        return "Post{" + '\n' +
                "id='" + id + '\n' +
                ", text='" + text + '\n' +
                ", type='" + type + '\n' +
                ", user='" + user + '\n' +
                ", upVotes=" + upVotes + '\n' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpVotes() {
        return upVotes;
    }
}
