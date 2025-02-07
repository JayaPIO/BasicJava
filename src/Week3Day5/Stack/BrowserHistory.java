package Week3Day5.Stack;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> forwardStack ;
    private Stack<String> backStack;
    private String currentPage;

    BrowserHistory(){
        forwardStack =new Stack<>();
        backStack = new Stack<>();
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }
    public void visitNewPage(String page){
        backStack.push(currentPage);
        currentPage =page;
    }

    public void back(){
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
        }
        else {
            System.out.println("back not possible ");
        }
    }
    public void forward(){
        if (!forwardStack.isEmpty()){
            backStack.add(currentPage);
            currentPage = forwardStack.pop();
        }
    }

    public String toString(){

        return "current page->"+currentPage +" back -> "+backStack+" forward -> "+forwardStack;
    }


    public static void main(String[] args){
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.visitNewPage("A");

        browserHistory.visitNewPage("B");

        browserHistory.visitNewPage("C");
        System.out.println(browserHistory);

        browserHistory.back();
        browserHistory.back();
        System.out.println(browserHistory);
        browserHistory.forward();
        System.out.println(browserHistory);

    }
}
