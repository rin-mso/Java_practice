package chapter8_rensyu2;

import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    // 書名と発行日が等価か判定
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    // 古い順に並びかえ
    public int compareTo(Book o) {
        return CompareToBuilder.reflectionCompare(this, o);
    }

    // colone()を呼び出すと深いコピーによる複製
    public Book clone() {
        Book b = new Book();
        b.title = this.title;
        b.publishDate = this.publishDate;
        b.comment = this.comment;
        b.publishDate = (Date) this.publishDate.clone();
        return b;
    }
}
