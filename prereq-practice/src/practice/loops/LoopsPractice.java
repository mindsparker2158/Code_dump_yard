package practice.loops;

public class LoopsPractice {
    public static void main(String[] args) {
        String str = "we have a large inventory of things in our warehouse falling in "
                + "the category: apparel and slightly"
                +"more in demand category: makeup along with the category: furniture and ...";
    printCategories(str);
    }
   public static void printCategories(String string){
        int searchposition=0;
        while (true){
            int find = string.indexOf("category:", searchposition);
            if (find==-1){
                break;
            }
            int start = find+10;
            int stop = string.indexOf(" ", start);
            System.out.println(string.substring(start, stop));
                searchposition=stop+1;
        }
   }

    }
