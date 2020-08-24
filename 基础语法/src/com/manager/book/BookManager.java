package com.manager.book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BookManager {
    private Book[] books;
    private Scanner input = new Scanner(System.in);

    //初始化方法：图书馆成立的时候预先增加书（一共能容纳10本书，成立时3本）
    public void init() {
        books = new Book[10];
        //{null,null,null,null,null...}
        Book book0 = new Book();
        book0.setName("tijava");
        book0.setId(1000);
        book0.setBorrowCount(0);
        book0.setState(1);


        Book book1 = new Book();
        book1.setName("高并发");
        book1.setId(1001);
        book1.setBorrowCount(0);
        book1.setState(1);


        Book book2 = new Book();
        book2.setName("分布式");
        book2.setId(1002);
        book2.setBorrowCount(0);
        book2.setState(1);
        //把三本书放到书的数组里面
        books[0] = book0;
        books[1] = book1;
        books[2] = book2;

    }

    //菜单
    public void menu() {
        System.out.println("======欢迎进入图书馆管理系统======");
        System.out.println("请根据提示选择");
        System.out.println("1.增加图书");
        System.out.println("2.删除图书");
        System.out.println("3.借阅图书");
        System.out.println("4.归还图书");
        System.out.println("5.图书风云榜");
        System.out.println("6.查看图书");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                deleteBook();
                break;
            case 3:
                borrowBook();
                break;
            case 4:
                returnBook();
                break;
            case 5:
                bookRank();
                break;
            case 6:
                showbooks();
                break;
            default:
                break;
        }
    }

    private void addBook() {
        System.out.println("增加图书");
        Book book = new Book();
        System.out.println("请输入书的编号");
        int id = input.nextInt();
        System.out.println("请输入书的名字");
        String name = input.next();
        //在库
        int state = 1;
        book.setId(id);
        book.setName(name);
        book.setState(state);
        //寻找增加的位置第一个为null的位置
        int position = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                position = i;
                break;
            }
        }
        books[position] = book;
//        Date bDate = null ;
//        int bCount = 0 ;
        isContinueMenu();
    }

    //根据书名来删除书籍
    private void deleteBook() {
        System.out.println("请输入要删除的书名");
        String name = input.next();
        //定位要删除的书的位置
        int position = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                position = i;
                break;
            }
        }
        //删除的本质是移动，从（Start,end）
        int start = position + 1;
        int firstNullPosition = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                firstNullPosition = i;
                //记得break;
                break;
            }
        }

        int end = firstNullPosition - 1;
        //书架满了没有null
        if (firstNullPosition == -1) {
            end = books.length - 1;
        }

        //数组删除要保持连续性
        //移动 从前往后
        for (int i = start; i < end; i++) {
            books[i - 1] = books[i];
        }
        //设置修后一个为Null
        books[end] = null;
        isContinueMenu();
    }

    private void borrowBook() {

        System.out.println("借阅图书");
        System.out.println("请输入要借阅书的名字");
        String name = input.next();
        int position = -1;
        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i].getName())) {
                position = i;
                break;
            }
        }
        Date date = new Date();
        books[position].setState(0);
        books[position].setBorrowDate(date);
        isContinueMenu();
    }

    private void returnBook() {
        System.out.println("归还");
        System.out.println("请输入归还图书名字");
        String name = input.next();
        int position = -1;

        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i].getName())) {
                position = i;
                break;
            }
        }
        books[position].setState(1);
        //被借次数三步走，第一步拿到原来的被借次数，第二布+1，第三步还回去
        int count = books[position].getBorrowCount() + 1;
        books[position].setBorrowCount(count);

        books[position].setBorrowDate(null);
        isContinueMenu();
    }

    private void bookRank() {
        System.out.println("风云排行榜");
        //如果使用原来的数组，那么这个排行榜将会改写真实的书籍排序顺序，所以使用赋值新数组的方式
        Book[] newBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                newBooks[i] = books[i];
            }
        }


        for (int i = 0; i < newBooks.length - 1; i++) {
            for (int j = 0; j < newBooks.length - 1 - i; j++) {
                //判断该书是不是为null,排除空指针..i+1也不能为空
                if (newBooks[i] != null && newBooks[i + 1] != null) {
                    //降序排
                    if (newBooks[i].getBorrowCount() < newBooks[i + 1].getBorrowCount()) {
                        Book temp = newBooks[i];
                        newBooks[i] = newBooks[i + 1];
                        newBooks[i + 1] = temp;
                    }
                }
            }
        }
        System.out.println("排行榜");
        for (int i = 0; i < newBooks.length; i++) {
            if (newBooks[i] != null)
                System.out.println("第" + (i + 1) + "名是" + newBooks[i].getName());
        }
        isContinueMenu();
    }

    //
    //查看所有书列表
    private void showbooks() {

        System.out.println("编号\t\t\t书名\t\t在库状态\t\t被借日期\t\t\t\t被借次数");
        for (Book book : books) {
            if (book != null) {
                //三目运算符判断外借图书日期是为被借，没被借显示-，被借了显示被借日期
                //      String  borrowDateStr=  book.getBorrowDate()==null?"-":book.getBorrowDate()+"";
                String getBorrowDateStr = "";
                if (book.getBorrowDate() == null) {
                    getBorrowDateStr = "-";
                } else {
                    //                  getBorrowDateStr = book.getBorrowDate()+"";
                    Date bDate = book.getBorrowDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                    getBorrowDateStr = sdf.format(bDate);

                }
                //
                String statestr = book.getState() == 0 ? "被借了" : "在库";
                System.out.println(book.getId() + "\t\t" + book.getName() + "\t\t" + statestr + "\t\t" + getBorrowDateStr + "\t\t\t\t" + book.getBorrowCount());
            }

        }
        isContinueMenu();
    }

    public void isContinueMenu() {
        System.out.println("是否返回菜单(Y/N)");
        String isContinue = input.next();
        if (isContinue.equals("Y")) {
            menu();//递归调用
        }
    }


}
