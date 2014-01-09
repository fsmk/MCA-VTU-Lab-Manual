//mca 3rd sem lab 5th program


import java.util.LinkedList;
import java.util.Scanner;

interface StackOperation {
        public void push();

        public void pop();

        public void display();
}

class Dystack implements StackOperation {
        int i = 0, count = 0;
        LinkedList<Integer> ll = new LinkedList<Integer>();

        public void push() {
                int ele = 0;
                System.out.println("Enter element :");
                Scanner s2 = new Scanner(System.in);
                try {
                        ele = s2.nextInt();
                } catch (Exception e) {
                        System.out.println("Exception caught");
                }
                ll.addFirst(ele);
                count++;
        }

        public void pop() {
                if (ll.isEmpty())
                        System.out.println("Stack is Empty");
                else {
                        System.out.println("Deleted value :" + ll.removeFirst());
                        count--;
                }
        }

        @Override
        public void display() {
                if (ll.isEmpty()) {
                        System.out.println("list is empty");

                }
                System.out.println(ll);
        }
}

class Ststack implements StackOperation {
        int i = 0, top = -1;
        int a[] = new int[50];
        int size = 5;

        public void push() {
                int ele = 0;
                if (top == size - 1)
                        System.out.println("full");
                else {
                        System.out.println("Enter element :");
                        Scanner s3 = new Scanner(System.in);
                        try {
                                ele = s3.nextInt();
                        } catch (Exception e) {
                                System.out.println("Error");
                        }
                        a[++top] = ele;
                }
        }

        public void pop() {
                if (top == -1)
                        System.out.println("Empty");
                else {
                        System.out.println("Deleted value :" + a[top--]);

                }
        }

        public void display() {
                System.out.println("List is");
                if (top == -1)
                        System.out.println("Empty");
                else {
                        for (int i = top; i >= 0; i--)
                                System.out.println(a[i]);
                }

        }

        public static class lab5a {
                public static int fun() {
                        System.out
                                        .println("1.push\n2.pop\n3.display\n4.exit\nenter your choice");
                        Scanner s = new Scanner(System.in);
                        return (s.nextInt());

                }

                public static void main(String[] args) {
                        Dystack ds = new Dystack();
                        Ststack ss = new Ststack();
                        Scanner s = new Scanner(System.in);
                        while (true) {
                                System.out
                                                .println("1.dynamic \n 2.static\n 3.exit\n enter your choice");
                                switch (s.nextInt()) {
                                case 1:
                                        int val = fun();
                                        if (val == 1) {
                                                ds.push();
                                        } else if (val == 2) {
                                                ds.pop();
                                        } else if (val == 3) {
                                                ds.display();
                                        } else {
                                                System.out.println("invalid choice");
                                        }
                                        break;
                                case 2:
                                        int val1 = fun();
                                        if (val1 == 1) {
                                                ss.push();
                                        } else if (val1 == 2) {
                                                ss.pop();
                                        } else if (val1 == 3) {
                                                ss.display();
                                        } else {
                                                System.out.println("invalid choice");
                                        }
                                        break;
                                case 3:
                                        System.exit(0);
                                }

                        }
                }
        }
}
