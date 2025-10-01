# Depths of Code Java 🧩

Projeto de **estudo e prática de desenvolvimento de jogos em Java**.  
Objetivo: recriar um roguelike inspirado em _Pixel Dungeon_, aprendendo conceitos como **game loop, tilemaps, geração procedural, combate, inventário e field of view**.

⚠️ **Aviso**: este repositório é para aprendizado.  
O código está em constante evolução e pode conter experimentos e soluções temporárias.

---

## 🎯 Objetivos do projeto

- Aprender a criar um motor de jogo simples em Java.
- Estudar técnicas de jogos 2D: loop, renderização, input, colisão.
- Implementar geração procedural de dungeons.
- Criar sistemas de inventário, inimigos e combate.
- Desenvolver visão limitada (fog of war).
- Exportar uma versão jogável (JAR).

---

## 🛠️ Tecnologias

- **Java 17+** (linguagem principal)
- **Java2D / Swing (JFrame + Canvas)** para renderização
- **Gradle** para build
- **Git + GitHub** para versionamento e portfólio

---

## 📅 Roadmap de desenvolvimento

### Fase 1 — Motor básico

- [✅] Criar janela do jogo (`JFrame` + `Canvas`).
- [✅] Implementar loop de jogo (update + render).
- [ ] Capturar input do teclado.
- [ ] Mostrar FPS/UPS na tela.

### Fase 2 — Mundo e movimento

- [ ] Criar player como quadrado que se move.
- [ ] Implementar tilemap fixo (chão/parede).
- [ ] Colisão básica com paredes.
- [ ] Implementar câmera que segue o player.

### Fase 3 — Entidades e combate

- [ ] Criar classe base `Entity`.
- [ ] Adicionar inimigos simples que perseguem o player.
- [ ] Implementar sistema de vida e combate.
- [ ] Criar itens coletáveis e inventário simples.

### Fase 4 — Roguelike systems

- [ ] Implementar dungeon procedural (BSP / drunkard’s walk).
- [ ] Adicionar fog of war / visão limitada.
- [ ] Spawn de inimigos e itens randômicos.

### Fase 5 — Polimento

- [ ] HUD (HP, inventário).
- [ ] Menus (início, pausa, game over).
- [ ] Efeitos sonoros básicos.
- [ ] Sistema de salvar/carregar.
- [ ] Exportar build (JAR jogável).

---

## 📚 Plano de estudos paralelo

O desenvolvimento será acompanhado por estudos semanais em:

- Java básico → classes, objetos, arrays, coleções.
- Game loop e renderização 2D.
- Algoritmos de geração procedural.
- Estruturas de dados e orientação a objetos.
- UI e manipulação de arquivos em Java.

---

## 🚀 Como rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/Depths-of-Code.git
   ```
2.Entre na pasta do projeto:
   ```bash
   cd src/com/depthofcode/game
   ```
3.Compile e rode:
   ```bash
   gradle run
   ```

---

## 🧭 Progresso

Este repositório acompanhará minha evolução:

- Primeiro, o jogo será feito em **Java puro**.
- Depois, será expandido/testado em **frameworks** ou **engines** (como LibGDX ou Godot).

---

## 📜 Licença

Projeto criado para fins de **aprendizado pessoal**.  
Poderá futuramente ser publicado como **open-source** para ajudar outros estudantes de programação e desenvolvimento de jogos.
