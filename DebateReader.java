/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debatereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kendall
 */
public class DebateReader {
    
    private Scanner s;
    
    public DebateReader(File inFile) throws FileNotFoundException
    {
        s = new Scanner(inFile);
        breakUp();
    }
    
    private String[] breakUp()
    {
        //dynamic array
        ArrayList block = new ArrayList();
        
        //goes until document is empty
        while (s.hasNext())
        {
            //add word by word
            block.add(s.next());
        }
        
        //cast array list to array
        return (String[]) block.toArray();
        
    }
    
    
    
    
    
    
    
}
