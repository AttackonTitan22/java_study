package com.zhounian.algorithm;

public class BlockSearch {
    public static void main(String[] args) {
        /*
            分块查找
            核心思想:
                 块内无序，块间有序
             实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可

         */
        int[] arr={16,5,9,12,21,18,
                   32,23,37,26,45,34,
                    50,48,61,52,73,66};
        //创建三个块的对象
        Block b1=new Block(21,0,5);
        Block b2=new Block(45,6,11);
        Block b3=new Block(73,12,17);

        //定义数组用来管理三个块的对象（索引表）
        Block[] blocks={b1,b2,b3};

        //定义一个变量用来记录要查找的元素
        int number=37;

        //调用方法，传递索引表，数组，要查找的元素
        int index=getIndex(blocks,arr,number);

        //打印一下
        System.out.println(index);
    }

    private static int getIndex(Block[] blocks, int[] arr, int number) {
        //1.确定number是在哪一块当中
        int indexBlock=findIndexBlock(blocks,number);
        if(indexBlock==-1)
            return -1;
        //2.获取这一块的起始索引和结束索引
        int startIndex=blocks[indexBlock].getstartIndex();
        int endIndex=blocks[indexBlock].getEndIndex();

        //3.遍历
        for (int i = startIndex; i < endIndex; i++) {
            if(arr[i]==number)
                return i;
        }
        return -1;
    }

    //定义一个方法用来确定number在哪一块当中
    public static int findIndexBlock(Block[] blocks,int number){
//        Block b1=new Block(21,0,5);
//        Block b2=new Block(45,6,11);
//        Block b3=new Block(73,12,17);
        for (int i = 0; i < blocks.length; i++) {
            if(number<=blocks[i].getMax())
                return i;
        }
        return -1;
    }
}


class Block{
    int max;
    int startIndex;
    int endIndex;

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
    public int getMax(){
        return max;
    }

    public int getstartIndex(){
        return startIndex;
    }
    public int getEndIndex(){
        return endIndex;
    }
}