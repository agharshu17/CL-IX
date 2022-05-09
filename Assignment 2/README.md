# Message Passing Interface

1. Implements parallelism in applications
2. MPJ Express is a message passing library
3. Follows **Single Program Multiple Data** programming model
4. MPJ has two configurations
  <br>a. Multicore - used for laptops and individual machines
  <br>b. Cluster - used for clusters of machines
5. Group is the set of processes that communicate with one another.
6. Communicator is the central object for communication in MPI.
7. There is a default communicator whose group contains all initial processes, called `MPI_COMM_WORLD`.
8. `MPI_COMM_WORLD.Size` function reports the number of processes.
9. `MPI_COMM_WORLD.Rank` function reports the rank, a number between 0 and 1, identifying the calling process.

## Commands
1. Compile - `javac -cp $MPJ_HOME/lib/mpj.jar ScatterGather.java`
2. Execute - `$MPJ_HOME/bin/mpjrun.sh -np 4 ScatterGather`

## Class Methods
1. `MPI.Scatter(sendbuf[], offset, chunk_size, data_type, recvbuf[], offset, chunk_size, data_type, root)`
2. `MPI.Gather(recvbuf[], offset, chunk_size, data_type, sendbuf[], offset, chunk_size, data_type, root)`
3. `chunk_size = array_size / number of processes`

https://stackoverflow.com/questions/29321198/how-scatter-and-gather-works-in-mp-j-express