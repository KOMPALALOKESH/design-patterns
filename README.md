# design-patterns
standard design patterns in java for system design.

## Singleton tradeoffs: 

In multithreading, locks are expensive primarily because of operating system overhead and thread blocking. When a thread hits a traditional lock (like synchronized in Java or a mutex in C++), it doesn't just wait politely; the operating system has to step in to manage it.

### Why Locks Are Expensive

* Context Switching Overhead: When a thread fails to acquire a lock, the Operating System kernel puts that thread to sleep and schedules another one to run. Saving the state of the first thread and loading the state of the second thread is an incredibly expensive CPU operation.
* Thread Scheduling & Latency: Waking a sleeping thread up once the lock becomes free takes time. This latency slows down high-performance applications.
* Resource Waste (Priority Inversion & Deadlocks): A high-priority thread can get blocked waiting for a low-priority thread to release a lock, dragging down the application's overall throughput.
* CPU Cache Invalidation: Moving threads between different CPU cores forces the hardware to constantly clear and reload high-speed CPU caches.

### The Alternatives to Locks
To build high-performance systems without the heavy tax of locking, developers use Non-Blocking and Lock-Free programming techniques.
### 1. Atomic Operations (CAS - Compare-And-Swap)
Instead of locking a whole block of code, modern CPUs have a special hardware instruction called Compare-And-Swap (CAS).
Instead of waiting for a lock, a thread reads a value, calculates a new value, and asks the CPU: "If the current value is still X, change it to Y. If it changed while I was working, tell me so I can try again." Because this happens directly in the CPU hardware, the thread never goes to sleep.

* How it looks in Java: Classes like AtomicInteger, AtomicBoolean, and AtomicReference.
* Pros: Extremely fast when thread contention is low to moderate. No context switching.

### 2. Volatile Keywords (Memory Barriers)
If you only need to ensure that multiple threads always see the absolute latest value of a variable (and you aren't doing complex read-modify-write operations), you don't need a lock. You just need a memory barrier.
Declaring a variable as volatile tells the CPU never to cache that variable locally in a core, forcing all threads to read and write directly to main memory.

* Pros: Zero synchronization overhead. Very lightweight.

### 3. Thread Confinement (Immutable Objects)
The absolute cheapest lock is the one you don't need. If an object cannot be changed after it is created (like a Java String), it is inherently thread-safe. Multiple threads can read it simultaneously without any locks or atomic operations because no thread will ever alter its state.

* Pros: Perfect performance, completely safe.

### 4. Actor Model / Message Passing
Instead of having multiple threads share a single piece of data and fighting over it with locks, threads communicate by sending messages to each other. One thread completely owns the data, and other threads must ask it to make changes.

* Used in: languages like Go (Channels), Erlang, and frameworks like Akka.
* Pros: Eliminates shared state entirely, removing the possibility of race conditions.

### Direct Comparison

| Strategy | OS Overhead | CPU Utilization | Best Used For |
|---|---|---|---|
| Traditional Locks | High (Context switches) | Low (Threads sleep) | Long-running operations, heavy I/O |
| Atomic (CAS) | None (Hardware level) | High (Loops if failing) | Counters, single variable updates |
| Volatile | None | Low | Status flags, visibility-only updates |
| Immutability | None | Low | Data sharing, configuration objects |
