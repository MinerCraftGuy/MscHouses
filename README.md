# Msc Houses Repository
**All new versions can be found [here](http://minecraft.curseforge.com/mc-mods/msc-houses/files) beginning with version 5.0**

[Minecraft Forums Page](http://www.minecraftforum.net/topic/1763986-)  
[Compiling](https://github.com/mrkirby153/MscHouses#compiling)
[Contributing](https://github.com/mrkirby153/MscHouses#contributing)

#### Compiling
IMPORTANT: Report any issues you may have. There may be some problems with the documentation
***
**Prerequisites**
**Please make sure you know what you are doing! It is not my fault if you completely blow up your system :)**

1. Download and install the Java JDK [from here](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html) for your OS.
  1. Go to `Controll Pannel/System` and click on `Advanced System Settings`
  2. Click on `Environment Variables`
  3. Under `System Variables` click `New`
  4. For `Variable name`, input `JAVA_HOME`
  5. For `Variable Value`, input something similar to `C:\Program Files\Java\jdk1.7.0_25` or where Java JDK was installed
  6. Scroll down to a variable named `Path` and double click it.
  7. Append `;%JAVA_HOME%\bin` and click OK
2. Download Apache Ant [from here] (http://ant.apache.org/)
  1. Unizp the files anywhere you want, eg `C:\ant\`. Just **Remember where you put it**
  2. Once again, go to your `Environment Variables`
  3. Under System Variables, click `New`
  4. For `Variable Name` input `ANT_HOME`
  5. For `Variable Value` input `C:\ant`
  6. Scroll down to `Path` and double click it.
  7. Append `;%ANT_HOME%\bin` EXACTLY as shown to the end.
3. Download and install Github for [windows](http://windows.github.com/) or for [mac](http://mac.github.com/). Note: Github is OPTIONAL! You can use your own git application
  1. Create a Github account
  2. Scroll to the top of the [github page](https://github.com/mrkirby153/MscHouses/) and login
  3. Click `Clone in Desktop` near the bottom of the right-hand toolbar. If prompted, chose `Launch`. (Chrome)
    * Github will flash and `mrkirby153/MscHouses` will apear
    * The local reposiotry defaults to `C:\Users\(username)\Documents\GitHub\MscHouses`
4. Create an empty directory for development. This directory is referred to as `Development` from now on. It can be where MscHouses was cloned but it mgith be a bit messy
5. If you are using a different directory, copy/move all `MscHouses/` to `Development/source`

**Installing**

1. Open up your OS's command-line and execute `cd Dev's Location\source`
2. Execute `ant install-source`. This will generally take 5-15 minutes depending on your computer. If you've done everything right, `BUILD SUCCESSFULL` is displayed after it finished
  * If `BUILD FAILED` is displayed, check the error output (Near `BUILD FAILED`). Fix everyting and try again
3. Go to `Development/source/MscHouses/Releases/1.6.4/<VERSION NUMBER>`
  * You should see a .jar file named `Msc Houses-universal-<VERSION NUMBER>-<BUILD NUMBER>`
4. Copy the jar into your Minecraft Mods folder and play!

**Updating your Repo**  

1. Check if mrkirby153 has updated MscHouses (he probably did) since the last time you've compiled. If he did, follow these insructions
2. Open Github
3. Double click on `mrkirby153/MscHouses`
4. At the top there is a button named `Sync`/`Sync Branch` (or `Refreshing...` if it's still checking)
5. Click `Sync`, and wait for it to finish
6. Re-compile (or move it to `Development/source` then re-compile) by running `ant build`

### Contributing
***
**Submitting a PR**

Found a bug? Want to make it more efeccent? Want to just help out? Great!!

**IMPORTANT: mrkirby153 DOES *NOT WANT ANY** `build.xml` **CHANGES UNLESS if fixes up something broken**

1. If you haven't already create a Github account
2. Click the `Fork` icon at the top right of this page.
3. Make the changes you want to
4. Click `Pull Request` ant thre right-hand side of the grey bar below  your fork's name
5. Click `Click to create a pull request for this  comparison`, enter your PR's title and a detailed description telling mrkirby153 what you've changed. EX: `Made generations more effecient`
6. Click `Send Pull Request` and you're done

**Creating an issue**

Game crashing? Have a suggesstion? Found a bug? Create an issue now!

Please don't create any frivolous issues! If it's a crash, post it on the forum. If it's a bug, make sure it hasn't been reported already

1. Go to the [issues page](https://github.com/mrkirby153/MscHouses/issues)
2. Click the bright green `New Issue` button
3. Enter your issue's title (Something that sumarizes the issue) and create a detailed description on how to reproduce it. **PROVDE A CRASHLOG IF THERE IS ONE**
4. Click `Submit Issue` and your done!
