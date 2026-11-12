class Super {
    int a = 0;
}

class Sub {
    public Sub(Super s) { // receives reference of Super object
        System.out.println("HIII : " + s.a);
    }
}

// Association (Uses-A)
// Sub --------uses--------> Super

class Association {
    public static void main(String[] args) {

        Super s = new Super(); // Super object created independently
        s.a = 10;

        Sub sb = new Sub(s);   // same Super object's reference is passed

        /*
         * Even if the Sub object is removed,
         * the Super object can still exist independently.
         *
         * Sub only uses the Super object.
         * It does not own, create, or destroy it.
         *
         * Therefore this relationship is called
         * Association (Uses-A Relationship).
         */
    }
}