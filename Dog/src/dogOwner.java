public class dogOwner {

    /**
     * Does the dog need taking for a walk?
     * @param d  The dog that needs walking.
     * @return	 Whether or not to take the dog for a walk.
     */
    public boolean takeForWalk(Dog d) {
        if (d.needsToGo()) {
            return true;
        }
        return false;
    }
}