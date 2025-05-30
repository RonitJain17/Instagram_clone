package com.example.instagram_clone.data.repository

import com.example.instagram_clone.data.model.Feed
import com.example.instagram_clone.data.model.Story

val stories = listOf(
    Story(userNickName = "jonDoe", userAvatar = "https://photosnow.org/wp-content/uploads/2024/04/boys-dp-for-instagram_3.jpg"),
    Story(userNickName = "emaa", userAvatar = "https://img.freepik.com/free-photo/young-beautiful-woman-pink-warm-sweater-natural-look-smiling-portrait-isolated-long-hair_285396-896.jpg"),
    Story(userNickName = "dutcherson", userAvatar = "https://img.freepik.com/free-photo/portrait-white-man-isolated_53876-40306.jpg?semt=ais_items_boosted&w=740"),
    Story(userNickName = "rosh_9", userAvatar = "https://static.vecteezy.com/system/resources/thumbnails/005/346/410/small_2x/close-up-portrait-of-smiling-handsome-young-caucasian-man-face-looking-at-camera-on-isolated-light-gray-studio-background-photo.jpg"),
    Story(userNickName = "rishi", userAvatar = "https://thumbs.dreamstime.com/b/portrait-young-handsome-man-white-shirt-outdoor-portrait-young-handsome-man-white-shirt-outdoor-nice-appearance-131934608.jpg"),
    Story(userNickName = "john", userAvatar = "https://burst.shopifycdn.com/photos/dark-haired-man-in-brown-leather-jacket.jpg?width=1000&format=pjpg&exif=0&iptc=0"),
    Story(userNickName = "harry", userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTS7AiWKSLuNFQqtHEKxq6OgdTQYctWcUXR4g&s"),
    Story(userNickName = "ron", userAvatar = "https://burst.shopifycdn.com/photos/professional-man-portrait.jpg?width=1000&format=pjpg&exif=0&iptc=0"),
    Story(userNickName = "eddie", userAvatar = "https://femina.wwmindia.com/content/2021/sep/women-thumb1632797644.jpg"),
    Story(userNickName = "will", userAvatar = "https://media.istockphoto.com/id/1289220545/photo/beautiful-woman-smiling-with-crossed-arms.jpg?s=612x612&w=0&k=20&c=qmOTkGstKj1qN0zPVWj-n28oRA6_BHQN8uVLIXg0TF8="),
    Story(userNickName = "micheal", userAvatar = "https://media.istockphoto.com/id/1278978817/photo/portrait-of-happy-mature-man-smiling.jpg?s=612x612&w=0&k=20&c=GPniKSszzPgprveN7sCT5mb-_L3-RSlGAOAsmoDaafw="),
)


val feedList = listOf(
    Feed(
        userNickName = "alexturner",
        userAvatar = "https://collectionimages.npg.org.uk/large/mw263083/Alex-Turner.jpg",
        localName = "Sheffield - UK",
        imageUrl = "https://www.rbsdirect.com.br/imagesrc/15217916.jpg?w=700",
        description = "I wanna be your Ford Cortina I will never rust...",
        postedAgo = "1 day ago"
    ),
    Feed(
        userNickName = "joji",
        userAvatar = "https://akamai.sscdn.co/tb/letras-blog/wp-content/uploads/2022/07/4930a5e-Joji-1024x741.jpg",
        localName = "Osaka - Japão",
        imageUrl = "https://i.ytimg.com/vi/FvOpPeKSf_4/maxresdefault.jpg",
        description = "Perfect don't mean that it's working. So what can I do? Cause sometimes I look in her eyes and that's where I find a glimpse of us. And I try to fall for her touch. But I'm thinkin' of the way it was said I'm fine and said I moved on. I'm only here passin' time in her arms, hopin' I find a glimpse of us.",
        postedAgo = "2 hrs ago"
    ),
    Feed(
        userNickName = "tricks&combo",
        userAvatar = "https://i.ytimg.com/vi/UNPuyZwrwXw/mqdefault.jpg",
        localName = "Rival vs Rival",
        imageUrl = "https://www.deltager.no/img/6672/93308H3CL2D6J.jpg",
        description = "Alan - Biohazard",
        postedAgo = "1 week ago"
    ),
    Feed(
        userNickName = "chevette",
        userAvatar = "https://i.pinimg.com/736x/98/c8/80/98c88087cf3e0db1db4f67eaa9755ff9.jpg",
        localName = "Localiza ai",
        imageUrl = "https://i0.wp.com/www.autocustom.com.br/wp-content/uploads/2017/05/a7ab71535e6118088d874a5ad20fcbb5.jpg?fit=1200%2C795&ssl=1",
        description = "É necessário sempre acreditar que o sonho é possível, que o céu é o limite e você, truta, é imbatível. Que o tempo ruim vai passar, é só uma fase que o sofrimento alimenta mais a sua coragem que a sua família precisa de você, lado a lado se ganhar pra te apoiar se perder.",
        postedAgo = "10 hrs ago"
    ),
    Feed(
        userNickName = "barbaraliskov",
        userAvatar = "https://www.ufrgs.br/enigma/wp-content/uploads/2021/11/20091222102310-0_0.jpg",
        localName = "Los Angeles - CA",
        imageUrl = "https://stackify.com/wp-content/uploads/2018/04/SOLID-Principles-Liskov-Substitution-1-881x441-1.png",
        description = "Princípio da Inversão de Liskov: um guia fundamental na programação orientada a objetos. Ele estabelece que as classes derivadas devem ser substituíveis por suas classes base, sem alterar o comportamento esperado do programa. Em outras palavras, se um código funciona com uma determinada classe, ele também deve funcionar com suas subclasses. Isso garante a consistência e a extensibilidade do sistema, evitando surpresas indesejadas. Mantenha suas classes em harmonia e construa um código sólido com a Inversão de Liskov.",
        postedAgo = "1 mon ago"
    ),
    Feed(
        userNickName = "tostao",
        userAvatar = "https://static-img.zz.pt/history/imgS620I11658T20190122154103.png",
        localName = "Belo Horizonte - MG",
        imageUrl = "https://i.superesportes.com.br/wEPWY4M5T4JArv6VobXImoqp1-Y=/650x0/smart/imgsapp.mg.superesportes.com.br/app/noticia_126420360808/2022/12/31/3984997/dirceu-lopes-pele-e-tostao-reunidos-em-jogo-entre-cruzeiro-e-santos_1_360335.jpg",
        description = "Grande dia!",
        postedAgo = "47 minutes ago"
    ),
    Feed(
        userNickName = "cazuza",
        userAvatar = "https://aventurasnahistoria.uol.com.br/media/uploads/personagem/cazuza_capa.jpg",
        localName = "Rio de Janeiro - RJ",
        imageUrl = "https://img.youtube.com/vi/ZBwjT-3t2O8/0.jpg",
        description = "EXAGERADO… Jogado aos teus pés, eu sou mesmo exagerado. Adoro um amor inventado!",
        postedAgo = "21 hrs ago"
    ),
    Feed(
        userNickName = "jovemwerther",
        userAvatar = "https://casadoestudo.com/wp-content/uploads/2023/01/Goethe.webp",
        localName = "Frankfurt - Alemanha",
        imageUrl = "https://brainly.com.br/_next/image?url=https%3A%2F%2Fpt-static.z-dn.net%2Ffiles%2Fd46%2F3c7459b8d9b596496031e2a527bf4967.jpg&w=1080&q=75",
        description = "É verdade, meu amigo, que cada dia compreendo melhor quão insensato é vivermos a julgar os outros. De minha parte, tenho tanto que fazer para modificar-me a mim mesmo, tanto esforço a despender para acalmar as tempestades do meu coração!... Ah! eu deixarei de bom grado que os outros façam o que bem entendam, contanto que eles me deixem fazer o mesmo.",
        postedAgo = "5 days ago"
    )
)