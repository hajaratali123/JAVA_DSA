package Basic.Arryas;

public class Declaration_Initialization {

    public static void main(String[] args) {

            // ── 1. DECLARE (no allocation yet) ──────────────────
    int[] arr1;             // preferred style
    int   arr2[];           // also valid (C-style, avoid)

    // ── 2. DECLARE + ALLOCATE (default values) ──────────
    int[] nums = new int[5];  // [0, 0, 0, 0, 0]
    System.out.println(nums);

    // ── 3. DECLARE + ALLOCATE + INITIALIZE ──────────────
    int[] scores = new int[] {90, 85, 78, 92};
    System.out.println(scores[1] +" The length "+ scores.length);

    // ── 4. ARRAY LITERAL (shorthand, compile-time only) ──
    int[] primes = {2, 3, 5, 7, 11};  // size inferred = 5
    System.out.println(primes);

    // ── 5. DYNAMIC SIZE ──────────────────────────────────
    int n = 10;
    int[] dynamic = new int[n];     // size decided at runtime

    // ── 6. READING/WRITING ELEMENTS ─────────────────────
    nums[0] = 100;          // write
    int x = nums[0];         // read  → x = 100

    // ── 7. length PROPERTY ───────────────────────────────
    System.out.println(primes.length);  // 5 — NOT a method call!

        
    }
    
}
