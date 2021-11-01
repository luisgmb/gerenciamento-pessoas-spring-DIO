package one.digitalinnovation.personalapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personalapi.enums.PhoneType;

import javax.persistence.*;

@Entity
//anotações Lombok
@Data //insere getters e setters
@Builder //faz a construção dos objetos
@AllArgsConstructor //insere construtor com argumentos
@NoArgsConstructor //insere construtor vazio
public class Phone {
    @Id //anotações para fazer o mapeamento
    @GeneratedValue(strategy = GenerationType.IDENTITY) //incrementa a ID do banco de dados
    @Column(nullable = false) //cria no banco como notnull
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;
    @Column(nullable = false)
    private String number;

}
