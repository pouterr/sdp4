public interface IMagazine {
    public void addReader(IReader observer);
    public void removeReader(IReader observer);
    public void notifyReaders();
}
