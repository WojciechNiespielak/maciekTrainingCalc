/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zegar;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;



public class SoundClipTest extends JFrame {

   public SoundClipTest() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Budzik");
      this.setSize(300, 200);
      this.setVisible(true);
File path = new File("resources/test.mid");
      try {
         // Open an audio input stream.
         URL url = this.getClass().getClassLoader().getResource("path");
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }

   
}



