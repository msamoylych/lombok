class LockedOnStatic<Z> {
	static class Inner {
		private static final java.util.concurrent.locks.ReentrantLock LCK = new java.util.concurrent.locks.ReentrantLock();
		@lombok.experimental.Locked("LCK")
		public void foo() {
			System.out.println();
		}
	}
	class Inner2 {
		private final java.util.concurrent.locks.ReentrantLock LCK = new java.util.concurrent.locks.ReentrantLock();
		@lombok.experimental.Locked("LCK")
		public void foo() {
			System.out.println();
		}
	}
}
