                                                      Computer Networks Laboratory 
 
 
1. Write a TCL script to simulate the network described below 
 
Consider a small network with five nodes n0, n1, n2, n3, n4, forming a star topology. The node 
n4 is at the center. Node n0 is a TCP source, which transmits packets to node n3 (a TCP sink) 
through the node n4. Node n1 is another traffic source, and sends UDP packets to node n2 
through n4. The duration of the simulation time is 10 seconds. 
Write a Tcl script (in the text area below) to simulate this scenario. Once you have written your 
simulation script, click on the "Run" button to execute it. You can verify your code by clicking 
on the "View Solution" button at the bottom of the page. 
 
2. Write a TCL script to simulate a file transfer with ns2 
 
Consider a client and a server. The server is running a FTP application (over TCP). The client 
sends a request to download a file of size 10 MB from the server. Write a script to simulate this 
scenario. Let node #0 be the server and node #1 be the client. TCP packet size is 1500 B. 
Assume typical values for other parameters. 
Note: This simulation require transfer of a fixed size file. Therefore, time required for the 
transfer would be constant for a given bandwidth of a link. To verify this, determine the time 
that would roughly be required for the transfer. Then look at the bottom of the trace file and 
verify whether there is any transmission beyond the time calculated. 
To verify that the client has downloaded the entire file, plot the "Bytes Received " curve for 
node 
"1. The y-axis is in Kbits. Convert it to MB and verify whether it approximates the specified file 
size. TCP headers would effectively increase the count of received bytes at node." 
 
3.Setting up a local area network with ns2 
 
In this exercise you will be simulating a CSMA/CD based LAN with ns2. Consider the LAN 
with seven nodes to be an isolated one i.e. not connected to the Internet. Node # 0 in the LAN 
act as a UDP traffic source, and node # 6 is the destination node. Assume CBR traffic to be 
flowing between the nodes. The simulation lasts for 25 seconds. 
In Ethernet a packet is broadcasted in the shared medium, and only the destination node accepts 
the packet. Other nodes simply drop it. What should be the number of hops a packet from node # 
0 to node # 6 travel? Verify this from the "Hop Count" plot. 
Additional Task: 
Suppose the above LAN is to be connected to the Internet. Add node # 7 into the network so that 
it act as the gateway. Connect node # 0 and # 7 with a 1 Mb wired link. Move the UDP source to 
node # 7. How the hop count should get affected in this case? Verify from the plot. 
 59 
 
 
4. Simulating link errors 
 
Consider the following network diagram 
 
 
Here node # 2 act as a router. Any traffic to or from the LAN passes through it. Consider node # 
1 running a FTP server, and node # 5 is downloading a file of size 4 MB. However, the link 
between node # 2 and # 3 is fault. It drops packets with a fixed probability of 0.2. Implement a 
link error model to reflect this. 
It may be noted here that the file download time will be more than the we had in exercise # 2 of 
experiment # 1. Try different values of the simulation time to ensure that the file has been 
entirely transferred. Is the plot of bytes received a linear curve or non-linear? Why? 
Presence of link errors cause one or more packets to be retransmitted. Verify this from the 
"Packet Retransmissions" plot. 
 
5. Measuring Network Performances 
 
Bottleneck in the network 
 
Consider a dumbbell topology with eight nodes as shown as in the following figure. Consider 
nodes# 2 and 3 to be two routers connecting two different networks. When the bandwidth of the 
link 2-3 is much lower than the sum of bandwidths of the other links in the network, it act as a 
bottleneck. 
 
 
 60 
 
Assume node # 0 running a FTP application (over TCP) and sending data to node # 6. Node # 1 
is sending CBR data node # 7. Assume all the links except 2-3 has a bandwidth of 1 Mb, 
propagation delay of 10ms and queue type as DropTail. (All are duplex links). 
 
Tasks: 
 
• The link 2-3 has a propagation delay of 10 ms. Vary it's bandwidth from 0.5 Mb to 2.5 Mb in 
steps of 0.25Mb. 
• Compute the throughput for node # 3 in each case 
• Plot the throughput vs. bandwidth data in the "Custom Plot" section below 
Based on the above plots, suggest what should be the recommended bandwidth of the link 2-3. 
Now, plot the end-to-end delay between nodes 0 and 6 for the above chosen values of link 2-3 
bandwidth. Revisit your previous answer (i.e. optimum bandwidth of link 2-3) based on these 
graphs. 
 
Measuring Network Performances 
6. Bandwidth sharing between TCP and UDP 
Consider the dumbbell topology from our previous exercise: 
 
 
 
Node # 0 is a TCP source, and the corresponding sink is at node # 6. Node # 1 is a UDP source 
(CBR traffic) with a null agent attached to node # 7. These two traffic flows through the 
common link 2-3. The aim of this exercise is to examine how TCP and UDP share the 
bandwidth between themselves when the rate of CBR traffic is changed. 
Set the TCP packet size to 1460 B. The UDP and CBR packet sizes are 1500 B. All the links in 
the network have same bandwidths (say, 4 Mb), delay and queue types. 61 
 
 
Part 1: 
• Set the initial rate of CBR traffic to 0.5 Mb. Run the simulation, and plot the "Bytes 
Received" by node #s 4 and 5 (sinks for TCP and UDP traffic) 
• Now, increment the rate up to 4 Mb, the link bandwidth, in steps of 0.5 Mb. Run the 
simulation and plot the graphs again. 
How does the graphs change after each run? In particular, what's the nature of the graphs when 
the rate of CBR traffic is 50% of the bandwidth? 
Part 2: Behaviour of UDP 
 
• Reduce the bandwidth of the link 2-3 to say, 2 Mb. Repeat the above steps and observe the 
graphs in this case. 
From the graphs plotted observe how UDP occupies a larger portion of the bandwidth. How 
does 
the behaviour change for other variations of TCP (Newreno, Vegas)? 
 
7. Write a TCL script to simulate the following scenario with ns2 simulator. 
 
Consider six nodes, (as shown in the figure below) moving within a flat topology of 700m x 
700m. 
 
 
 
The initial positions of nodes are 0 (150,300) ,1 (300,500),2 (500,500),3 (300,100),4(500,100) 
and 5(650,300) respectively.A TCP connection is initiated between node 0 (source) and node 5 
(destination) through node 3 and node 4 i.e the route is 0-3-4-5. 
At time t = 3 seconds the FTP application runs over it. 
After time t=4.0 sec, node 3 (300,100) moves towards node 1 (300,500) with a speed of 
5.0m/sec 
and after some time the path break, then the data transmit with a new path via node 1 and node 2 
i.e the new route 0-1-2-5. 
The simulation lasts for 60 secs. In the above said case both the route has equal cost. 
Use DSR as the routing protocol and the IEEE 802.11 MAC protocol. 
NowAnalyze the trace file and determine when the use of second route commence, and 
Plot the number of packets received by each node over the entire time duration of the simulation 
 
8. Simulate a wired network and demonstrate Distance Vector Routing algorithm . 62 
 
9. Simulate a network which will create congestion in the network.With the trace file 
created identfy the points at which congestion occurs by writing sed / awk scripts. Also 
write a mechanism to correct/control the congestion. 
Note : Network Free and open source software simulators like NS2 / NS3 could be used. If 
NS2 is used tcl scripting should be introduced . If NS3 is used c++ with python has to be 
introduced during first two or three weeks of the labs. Only above 9 experiments should be 
included for the laboratory exam. 
