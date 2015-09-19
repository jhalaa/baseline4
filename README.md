**PROBLEM DESCRIPTION**
The universe of the Game of Life is an infinite two-dimensional orthogonal grid of square cells, each of which is in one of two possible states, live or dead. Every cell interacts with its eight neighbours, which are the cells that are directly horizontally, vertically, or diagonally adjacent. At each step in time, the following transitions occur:
1.     Any live cell with fewer than two live neighbours dies, as if by loneliness.
2.     Any live cell with more than three live neighbours dies, as if by overcrowding.
3.     Any live cell with two or three live neighbours lives, unchanged, to the next generation.
4.     Any dead cell with exactly three live neighbours comes to life.
The initial pattern constitutes the 'seed' of the system. The first generation is created by applying the above rules Simultaneously to every cell in the seed — births and deaths happen simultaneously, and the discrete moment at which this happens is sometimes called a tick. (In other words, each generation is a pure function of the one before.) The rules continue to be applied repeatedly to create further generations

**SETUP ENVIRONMENT**
1. If Java is not running on your system, then download it using [this link] (http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)
2. Set the CLASSPATH so that Java can run on your system.
3. Download Apache Ant. If on OSX, then use [Home Brew] (http://brew.sh/). Use the command `brew install ant` and download it.
...If on any other Operating System, then use [this link] (https://ant.apache.org/bindownload.cgi)

**HOW TO BUILD THE CODEBASE**
1. Open a Terminal and type `ant build` to build the codebase.

**HOW TO RUN THE CODEBASE**
1. Open a Terminal and type `ant` to run it.