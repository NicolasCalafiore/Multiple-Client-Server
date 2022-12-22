import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;


import java.util.stream.Collectors;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.io.*;
import java.text.*;
import java.util.*;
import java.net.*;
  

public class NIKKIT_GM_M_Server 
{
    public static void main(String[] args) throws IOException 
    {

        ServerSocket ss = new ServerSocket(1234);
          

        while (true) 
        {
            Socket s = null;
              
            try 
            {
                s = ss.accept();
                  
                System.out.println("A new client is connected : " + s);
                  

                
          
                InputStreamReader inputStreamReader = new InputStreamReader(s.getInputStream());
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(s.getOutputStream());
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
                  
                System.out.println("Assigning new thread for this client");
  
               
                Thread t = new ClientHandler(s, bufferedReader, bufferedWriter);
                System.out.println("Thread: " + t + " assaigned");
               
                t.start();
                  
            }
            catch (Exception e){
                s.close();
                
                e.printStackTrace();  
            }
        }
        


        
        
        
    }
    
}
  

// ClientHandler class
class ClientHandler extends Thread 
{
    DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat fortime = new SimpleDateFormat("hh:mm:ss");
    final Socket s;
    final BufferedReader bufferedReader;
    final BufferedWriter bufferedWriter;
    
  
    // Constructor
    public ClientHandler(Socket s, BufferedReader bufferedReader, BufferedWriter bufferedWriter) 
    {
        this.s = s;
        this.bufferedWriter = bufferedWriter;
        this.bufferedReader = bufferedReader;
    }
  
    @Override
    public void run() 
    {
        String received;
        String toreturn;
        while (true) 
        {
            try {
            	
            	//LOGIC GOES HERE-----------------------------------------------------------------------------------------------------
            	break;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
          
        try
        {
            // closing resources
            this.bufferedWriter.close();
            this.bufferedReader.close();
            
   
              
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    

    
}