package DataStructure.Assignment_10;

import java.util.regex.*;
import java.util.List;
import java.util.ArrayList;

public class WikiPage {

    // attributes
    private String line;
    private int id;
    private String url;
    private String title;
    private String content;
    private List<String> wordList = new ArrayList<String>();

    // constructor
    public WikiPage(String line) {
        this.line = line;
    }

    // getter & setter
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        String rawId = this.getLine().split(" ")[1];
        String numericId = rawId.replaceAll("[^\\d]", "");
        this.id = Integer.parseInt(numericId);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl() {
        String rawUrl = this.getLine().split(" ")[2];
        this.url = rawUrl.replaceAll("[^\\d]", "");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        String rawTitle = this.getLine().split(" ")[3];
        this.title = rawTitle.replaceAll("[^\\d]", "");
    }

    public String getContent() {
        return content;
    }

    public void setContent() {
        int start = this.getLine().indexOf(">");
        int end = this.getLine().lastIndexOf("</doc>");
        if (start != -1 && end != -1 && end > start) {
            this.content = this.getLine().substring(start + 1, end).trim();
        } else {
            this.content = "";
        }
    }

    public List<String> getWordList() {
        return wordList;
    }

    public void setWordList() {
        Pattern pattern = Pattern.compile("\\b[a-z]{3,}\\b");
        Matcher matcher = pattern.matcher(this.getContent().toLowerCase());
        while (matcher.find()) {
            String word = matcher.group();
            if (!this.getWordList().contains(word)) {
                this.getWordList().add(word);
            }
        }
    }

}
