package chapter4_rensyu1;

import java.util.Date;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public int hashCode() {
        int r = 1;
        r = 31 * r + publishDate.hashCode();
        r = 31 * r + title.hashCode();
        return r;
    }

    // 書名と発行日が等価か判定
    public boolean equals(Object o) {
        // 自分自身が引数の場合
        if (this == o) {
            return true;
        }
        // 引数がnullの場合
        if (o == null) {
            return false;
        }
        // 型が異なる場合
        if(!(o instanceof Book)) {
            return false;
        }
        Book b = (Book) o;
        // 書名が異なる場合
        if (!title.equals(b.title)) {
            return false;
        }
        // 出版日が異なる場合
        if (!publishDate.equals(b.publishDate)) {
            return false;
        }
        return true;
    }

    // 古い順に並びかえ
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
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
