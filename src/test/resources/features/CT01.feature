Feature: Comprar produto

  @CT_01 @compra_produtos
  Scenario: CT01- Adcionar produto no carrinho
    Given que ao acessar o portal "https://www.americanas.com.br"
    When pesquisar o produto "SSD 240gb"
    And acessar o produto "Adata Ssd Su630 240gb Sata"
    And clicar em comprar
    Then produto "Adata Ssd Su630 240gb Sata" adicionado ao carrinho
