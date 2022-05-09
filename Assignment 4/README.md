# Election Algorithms

## Why is an election required?
1. Distributed processes need a coordinator that organizes actions of all processes.
2. A coordinator may fail, requiring an election to occur to choose the next process that will become the coordinator.
3. **Assumptions**
  <br>a. Each process knows it's own unique idenitfier
  <br>b. Each process knows other processes's unique identifiers

## Ring
1. Applies to systems organized as a ring (physically or logically)
2. We assume that a link between processes is unidirectional and every process can **only message the process on it's right**
3. If a process Pi detects a failure, it'll start an election nominating itself by adding it's id in the active list (an array of process identifiers) and passing it to the process on it's right
4. This goes on for Pi+1, Pi+2, .. until Pi receives the active list with it's id already added (meaning the list now has identifiers for all active processes)
5. Pi will select the best candidate based on the idenfitier priority (usually the highest id wins) and forward the result

## Bully
1. 