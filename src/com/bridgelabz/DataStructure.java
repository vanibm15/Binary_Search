package com.bridgelabz;

public class DataStructure {
    public void given3NumbersWhenAddedToBinaryTreeReturnsSizeThree(){
        DataStructure<Integer> dataStructure = new DataStructure();
        DataStructure.add(56);
        DataStructure.add(30);
        DataStructure.add(70);
        int size = DataStructure.getsize();
        Assert.assertEquals(3,size);


    }

    }

