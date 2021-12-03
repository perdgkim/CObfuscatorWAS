package com.tistory.stlab;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.Set;
import java.nio.file.attribute.*;
import org.apache.commons.lang3.RandomStringUtils;

import cobf.util.cObfuscator;

public class RunnerObfu {
	private static final Path baseDir = Paths.get("temp/user/res/obfu/");
	
	public RunnerObfu() {

		if(!(new File(baseDir.toString()).exists())) {
			try {
				Files.createDirectories(baseDir);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	String run(String text) throws IOException {
		String newFile;
		do{
			newFile=generateUniqueFileName() + ".txt";
		}
		while(new File(baseDir + "/" +newFile).exists());
		
		Path filePath = Paths.get(baseDir +"/"+ newFile).toAbsolutePath();
		
		Files.createFile(filePath);
		setPermission(filePath);
		Files.writeString(filePath, text, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.WRITE,
				StandardOpenOption.TRUNCATE_EXISTING);
		text = new cObfuscator().run(filePath.toString(),
				filePath.toString(), true);
		
		return text;

	}
	
	void setPermission(Path filePath) throws IOException {
        Set<PosixFilePermission> perms = Files.readAttributes(filePath,PosixFileAttributes.class).permissions();

        System.out.format("Permissions before: %s%n",  PosixFilePermissions.toString(perms));

        perms.add(PosixFilePermission.OWNER_WRITE);
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_EXECUTE);
        perms.add(PosixFilePermission.GROUP_WRITE);
        perms.add(PosixFilePermission.GROUP_READ);
        perms.add(PosixFilePermission.GROUP_EXECUTE);
        perms.add(PosixFilePermission.OTHERS_WRITE);
        perms.add(PosixFilePermission.OTHERS_READ);
        perms.add(PosixFilePermission.OTHERS_EXECUTE);
        Files.setPosixFilePermissions(filePath, perms);
	}
	
	@SuppressWarnings("deprecation")
	String generateUniqueFileName() {
	    String filename = "";
	    long millis = System.currentTimeMillis();
	    String datetime = new Date().toGMTString();
	    datetime = datetime.replace(" ", "");
	    datetime = datetime.replace(":", "");
	    String rndchars = RandomStringUtils.randomAlphanumeric(16);
	    filename = rndchars + "_" + datetime + "_" + millis;
	    return filename;
	}
}

