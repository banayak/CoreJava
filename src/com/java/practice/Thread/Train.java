package com.java.practice.Thread;

import java.util.List;

public class Train extends Thread
{
    // Reference variable of type Line.
    Line line;
    String threadName;
    List<Integer> accountNumbers;

    Train(Line line,String threadName, List<Integer> list)
    {
        this.line = line;
        this.accountNumbers = list;
        this.threadName = threadName;
        setName(threadName);
    }
    Train(Line line,String threadName)
    {
        this.line = line;
        this.threadName = threadName;
        setName(threadName);
    }

    @Override
    public void run()
    {
        if (threadName != null && threadName.equals("Number 3") || threadName.equals("Number 4")){
            line.getLineWithoutSynchronization();
        }else{
            //line.getLine();
            try {
                line.getLineSynBlock(accountNumbers);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
