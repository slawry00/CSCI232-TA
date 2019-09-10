package Lab1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spencer
 */
import java.io.*;
import java.util.*;

    public class Driver 
    {

        public static void main(String[] args) throws IOException 
        {
            InputStream num_file = null;
            InputStream text_file = null;
            try
            {
               num_file = new FileInputStream("numbers.txt");
               text_file = new FileInputStream("tinyTale.txt");
            }
            catch(FileNotFoundException E)
            {
                System.err.println("Your file needs to be in the directory with"+
                          " src, build, test.. etc. Or it is mispelled/missing");
                System.exit(-1);
        }
        Scanner text_scanner = new Scanner(text_file);
        Scanner num_scanner = new Scanner(num_file);
        ArrayStack<String> my_text_stack = new ArrayStack<String>(100);
        ArrayStack<Integer> my_num_stack = new ArrayStack<Integer>(100);
        
        while (text_scanner.hasNext())
        {
            my_text_stack.push(text_scanner.next());
        }
        while (num_scanner.hasNext())
        {
            my_num_stack.push(num_scanner.nextInt());
        }
        Iterator num_it = my_num_stack.iterator();
        Iterator text_it = my_text_stack.iterator();
        
        while (num_it.hasNext())
        {
            System.out.println(num_it.next());
        }
        while (text_it.hasNext())
        {
            System.out.println(text_it.next());
        }
    }
}
