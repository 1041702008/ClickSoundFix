# ClickSoundFix
This Mod Fixes an annoying Bug which would play the UI-Click Sound twice when opening a new UI and the Mouse-Cursor is over a Slider in this new UI.

**How it works**

By Default, The Game plays a UI Click sound when you click a button (when the Left mouse Button/Enter/whatever is PRESSED).
But for Sliders, it plays this sound when RELEASING the button, which in theory totally makes sense.
But this leads to the First Button triggering a click-sound on press, and the slider in the new ui triggering one as well when releasing it again. 

- Now this Mod adds a Timer, which starts counting up in ticks when the mod starts up. This time will reset to 0 every time a new UI is opened. 
  - Now if the Slider is released (when the second "annoying" sound plays), it only plays that second sound if that timer is greater than 5 (ticks). Which is 1/4 of a second. 
  - This should in theory not cause any issues, as no one will probably click and release a slider in a 1/4 second. 


**Feel free to include this in other projects, but in that case it'd be nice to credit me :)**
