package no.hvl.dat103.task3BookSolution;

interface RWlock{
	public abstract void acquireReadLock(int readerNum);
	public abstract void releaseReadLock(int readerNum);
	public abstract void acquireWriteLock(int writeNum);
	public abstract void releaseWriteLock(int writeNum);
}
