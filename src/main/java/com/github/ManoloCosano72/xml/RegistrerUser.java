package com.github.ManoloCosano72.xml;

import com.github.ManoloCosano72.model.entity.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;

public class RegistrerUser {
    public static void writeUserToXML(Object object, String filePath) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(object, new File(""));
    }

    public static <T> T readUserFromXML(Class<T> clase, String filePath) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(clase);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (T) unmarshaller.unmarshal(new File(""));
    }
    public static void addUserToXML(User user, String filePath) throws JAXBException {
        File file = new File(filePath);

        if (file.exists()) {
            User.setUsers(readUserFromXML(User.class, filePath).getUsers());
        } else {
            User.setUsers(new ArrayList<>());
        }
        User.addUser(user);
        writeUserToXML(User.getUsers(), filePath);
    }
}


