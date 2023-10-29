package q2_AlexandreFarias;

import java.io.*;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			String filename = "logins.txt";

			System.out.print("Digite um novo login: ");
			String newLogin = scanner.nextLine();
			System.out.print("Digite uma senha: ");
			String newPassword = scanner.nextLine();

			try (FileWriter fileWriter = new FileWriter(filename, true);
			     BufferedWriter writer = new BufferedWriter(fileWriter)) {
			    writer.write(newLogin + " " + newPassword);
			    writer.newLine();
			} catch (IOException e) {
			    System.err.println("Erro ao salvar login e senha.");
			    e.printStackTrace();
			}

			System.out.println("Cadastro realizado com sucesso!");

			System.out.print("Digite seu login: ");
			String login = scanner.nextLine();
			System.out.print("Digite sua senha: ");
			String password = scanner.nextLine();

			if (checkCredentials(filename, login, password)) {
			    System.out.println("SUCESSO: Login efetuado com sucesso!");
			} else {
			    System.out.println("FRACASSO: Login ou senha incorretos.");
			}
		}
    }

    private static boolean checkCredentials(String filename, String login, String password) {
        try (FileReader fileReader = new FileReader(filename);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2 && parts[0].equals(login) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro na verificação de credenciais.");
            e.printStackTrace();
        }
        return false;
    }
}
