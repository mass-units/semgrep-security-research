class Main{
  public void zip()
  {
       Enumeration<ZipEntry> entries = zip.getEntries();
   while (entries.hasMoreElements()) {
      ZipEntry e = entries.nextElement();
      File f = new File(destinationDir, e.getName());
      InputStream input = zip.getInputStream(e);
      IOUtils.copy(input, write(f));
  }
  }

  public void zip2()
  {
    Enumeration<ZipEntry> entries = zip.getEntries();
    while (entries.hasMoreElements()) {
       ZipEntry e = entries.nextElement();
         String canonicalDestinationDirPath = destinationDir.getCanonicalPath();
  File destinationfile = new File(destinationDir, e.getName());
  String canonicalDestinationFile = destinationfile.getCanonicalPath();
  if (!canonicalDestinationFile.startsWith(canonicalDestinationDirPath + File.separator)) {
    throw new ArchiverException("Entry is outside of the target dir: " + e.getName());
  }
       InputStream input = zip.getInputStream(e);
       IOUtils.copy(input, write(f));
  }
}
}