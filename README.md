# Tela de Login - TDD
## Objetivos
<p>
  Criar uma tela de login baseando-se na metodologia de desenvolvimento TDD (Test-Driven Development) e documentá-la.
</p>

## Criando os testes - Tela de Login
<p>
  Seguindo as determinações do TDD, foram criados os seguintes cenários de testes, os quais falharam, assim como esperado. 
  Dessa forma, é possível determinar o escopo do projeto com maior clareza.
</p>

    public class LoginScreenTest {
    @Test
    public void testSuccessfulLogin() {
    LoginScreen LoginScreen = new LoginScreen();
    assertTrue(LoginScreen.login("john", "password123"));
    }

    @Test
    public void testFailedLogin() {
        LoginScreen LoginScreen = new LoginScreen();
        assertFalse(LoginScreen.login("john", "wrongPassword"));
    }

    @Test
    public void testAddUser() {
        LoginScreen LoginScreen = new LoginScreen();
        LoginScreen.addUser("testuser", "testpassword");
        assertTrue(LoginScreen.login("testuser", "testpassword"));
    }
    }

## Criaçao da Classe Tela de Login
<p>
  A seguir, foi criada a classe LoginScreen. Foi utizado um HashMap, que simula de maneira simplificada uma base de dados. 
  Depois, um método de verificação dos dados inseridos pelo usuário. Por fim, foi adicionado, como exemplo, um novo usuário.
</p>

    import java.util.HashMap;
    import java.util.Map;
    
    /**
     * Classe para a autenticação, irá simular uma base de dados
     */
    public class LoginScreen {
        private Map<String, String> userDatabase;
    
        public LoginScreen() {
            userDatabase = new HashMap<>();
            userDatabase.put("john", "password123");
            userDatabase.put("alice", "securepass");
        }
    
        /**
         * Este trecho tentará autenticar o usuário baseado no usuário e senha do banco de dados.
         *
         * @param username o username do usuário tentando logar
         * @param password a senha digitada pelo usuário
         * @return retornara true se autenticação for bem sucedide, false caso contrário.
         */
        public boolean login(String username, String password) {
    
            if (userDatabase.containsKey(username)) {
                String storedPassword = userDatabase.get(username);
                if (storedPassword.equals(password)) {
                    return true; //Autenticação bem sucedida
                }
            }
            return false; //Autenticação falha
        }
    
        /**
         * Adiciona um novo usuário para a base de dados. Usado apenas para teste.
         * @param username o username do novo usuário
         * @param password a senha do novo usuário
         */
        public void addUser(String username, String password) {
            userDatabase.put(username, password);
        }
    }

##Refazendo Testes
<p>
  Feita a classe de acordo com os testes previamente estabelecidos, os mesmos foram novamente executados, dessa vez sem retornar erros
  e retornarndo o resultado esperado nos três testes.
</p>

##Documentação
<p>
  Por fim, foi feita a documentação utilizando Javadoc. O código foi comentando com a formatação específica de documentação, e foi gerado
  o documento Javadoc, conforme consta nos arquivos do projeto.,
</p>
