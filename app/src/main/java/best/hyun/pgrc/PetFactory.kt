package best.hyun.pgrc

import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.beast.*
import best.hyun.pgrc.type.berga.Berga
import best.hyun.pgrc.type.berga.Beruru
import best.hyun.pgrc.type.berga.Gorugoru
import best.hyun.pgrc.type.berga.Norunoru
import best.hyun.pgrc.type.beron.*
import best.hyun.pgrc.type.boogi.*
import best.hyun.pgrc.type.bubi.*
import best.hyun.pgrc.type.daino.*
import best.hyun.pgrc.type.dog.Jimung
import best.hyun.pgrc.type.dog.Jindol
import best.hyun.pgrc.type.dog.MongMong
import best.hyun.pgrc.type.dog.Mongdol
import best.hyun.pgrc.type.doori.Doori
import best.hyun.pgrc.type.doori.Stainwoori
import best.hyun.pgrc.type.doori.Woori
import best.hyun.pgrc.type.dorabys.*
import best.hyun.pgrc.type.fourguardiangods.BlackTortoise
import best.hyun.pgrc.type.fourguardiangods.BlueDragon
import best.hyun.pgrc.type.fourguardiangods.RedBird
import best.hyun.pgrc.type.fourguardiangods.WhiteTiger
import best.hyun.pgrc.type.gigaros.*
import best.hyun.pgrc.type.godsnake.*
import best.hyun.pgrc.type.gordon.*
import best.hyun.pgrc.type.hyubo.*
import best.hyun.pgrc.type.kaki.Horku
import best.hyun.pgrc.type.kaki.Kaki
import best.hyun.pgrc.type.kaki.Kuku
import best.hyun.pgrc.type.kaki.Taki
import best.hyun.pgrc.type.kaku.Baka
import best.hyun.pgrc.type.kaku.Bau
import best.hyun.pgrc.type.kaku.Kaku
import best.hyun.pgrc.type.kaku.Kau
import best.hyun.pgrc.type.keibee.Goldkabit
import best.hyun.pgrc.type.keibee.Kabit
import best.hyun.pgrc.type.keibee.Keibee
import best.hyun.pgrc.type.keibee.Kyuee
import best.hyun.pgrc.type.kkomi.*
import best.hyun.pgrc.type.ktarkas.*
import best.hyun.pgrc.type.kukuru.*
import best.hyun.pgrc.type.lagogo.Hubaba
import best.hyun.pgrc.type.lagogo.Lagogo
import best.hyun.pgrc.type.lagogo.Luni
import best.hyun.pgrc.type.lagogo.Toruru
import best.hyun.pgrc.type.manasipu.*
import best.hyun.pgrc.type.manmo.Manmo
import best.hyun.pgrc.type.manmo.Manmonas
import best.hyun.pgrc.type.manmo.Manmoros
import best.hyun.pgrc.type.manmo.Manmoru
import best.hyun.pgrc.type.marabia.Marabia
import best.hyun.pgrc.type.mui.*
import best.hyun.pgrc.type.negos.*
import best.hyun.pgrc.type.nostoros.*
import best.hyun.pgrc.type.ogaros.*
import best.hyun.pgrc.type.pentas.*
import best.hyun.pgrc.type.rare.Goruru
import best.hyun.pgrc.type.rare.Kingkkomi
import best.hyun.pgrc.type.rare.Morax
import best.hyun.pgrc.type.rare.Paaran
import best.hyun.pgrc.type.samdusa.Hwadusa
import best.hyun.pgrc.type.samdusa.Jidusa
import best.hyun.pgrc.type.samdusa.Poongdusa
import best.hyun.pgrc.type.samdusa.Sudusa
import best.hyun.pgrc.type.snake.EarthSnake
import best.hyun.pgrc.type.snake.FireSnake
import best.hyun.pgrc.type.snake.WaterSnake
import best.hyun.pgrc.type.snake.WindSnake
import best.hyun.pgrc.type.special.*
import best.hyun.pgrc.type.storaji.*
import best.hyun.pgrc.type.tora.*
import best.hyun.pgrc.type.werewolf.EarthWereWolf
import best.hyun.pgrc.type.werewolf.FireWereWolf
import best.hyun.pgrc.type.werewolf.WaterWereWolf
import best.hyun.pgrc.type.werewolf.WindWereWolf
import best.hyun.pgrc.type.woopu.Otutu
import best.hyun.pgrc.type.woopu.Pupu
import best.hyun.pgrc.type.woopu.Tutu
import best.hyun.pgrc.type.woopu.Woopu
import best.hyun.pgrc.type.woopu2d.Notutu2D
import best.hyun.pgrc.type.woopu2d.Popo2D
import best.hyun.pgrc.type.woopu2d.Putu2D
import best.hyun.pgrc.type.woopu2d.Pututu2D
import best.hyun.pgrc.type.yangiro.*
import best.hyun.pgrc.type.zyag.*

interface PetAbstractFactory { fun createPet(): Pet }
class BanboroFactory:
    PetAbstractFactory { override fun createPet(): Pet = Banboro() }
class BanginoFactory:
    PetAbstractFactory { override fun createPet(): Pet = Bangino() }
class BurudonFactory:
    PetAbstractFactory { override fun createPet(): Pet = Burudon() }
class GibinoFactory:
    PetAbstractFactory { override fun createPet(): Pet = Gibino() }
class LibinoFactory:
    PetAbstractFactory { override fun createPet(): Pet = Libino() }
class YangiroFactory:
    PetAbstractFactory { override fun createPet(): Pet = Yangiro() }

class PetFactory {
    companion object {
        // 특정 페트 얻기
        fun getPet(petAbstractFactory: PetAbstractFactory) = petAbstractFactory.createPet()

        // 모든 페트 종류 얻기 ( ~~~류 )
        fun getPetTypes(): Array<PET_TYPE> = PET_TYPE.values()

        /* 페트 리스트 [Start] */
        private fun getSpecialPets(): Array<Pet> = arrayOf(Laiby(), Bokwoori(), Fywable(), Peruru(), Dorudoru(), YongIceDragon(), Kawoo(), Hubaty())
        private fun getFourguardiansgodPets(): Array<Pet> = arrayOf(WhiteTiger(), RedBird(), BlackTortoise(), BlueDragon())
        private fun getWereWolfPets():Array<Pet> = arrayOf(EarthWereWolf(), WaterWereWolf(), FireWereWolf(), WindWereWolf())
        private fun getBeastPets(): Array<Pet> = arrayOf(EarthHorse(), WaterHorse(), FireHorse(), WindHorse(), MecaEarthHorse(), MecaWaterHorse(), MecaFireHorse(), MecaWindHorse(), EarthMouse(), WaterMouse(), FireMouse(), WindMouse())
        private fun getYangiroPets(): Array<Pet> = arrayOf(Libino(), Yangiro(), Banboro(), Bangino(), Burudon(), Gibino(), Bino(), Giro(), Boro(), Gino(), Rudon(), Ssagat(), Teinos())
        private fun getOgarosPets(): Array<Pet> = arrayOf(Ogaros(), Orgon(), Mogaros(), Golos(), Norgon(), Pooryong(), Jigaros(), Kalos())
        private fun getSamdusaPets(): Array<Pet> = arrayOf(Jidusa(), Sudusa(), Hwadusa(), Poongdusa())
        private fun getHyuboPets(): Array<Pet> = arrayOf(Hyubo(), Pobo(), Kubo(), Torozya(), Burubo())
        private fun getBubiPets(): Array<Pet> = arrayOf(Bubi(), GoldBubi(), Bui(), Buibee(), KingBui())
        private fun getKatarkasPets(): Array<Pet> = arrayOf(Katarkas(), Kukas(), Korokas(), Logian(), Lamgas(), Aikas(), Kutas(), Kargian())
        private fun getManmoPets(): Array<Pet> = arrayOf(Manmo(), Manmoru(), Manmonas(), Manmoros())
        private fun getGigarosPets(): Array<Pet> = arrayOf(Gigaros(), Megaros(), Bitros(), Gagaros(), Teraros())
        private fun getSnakePets(): Array<Pet> = arrayOf(EarthSnake(), WaterSnake(), FireSnake(), WindSnake())
        private fun getDogPets(): Array<Pet> = arrayOf(Jimung(), MongMong(), Jindol(), Mongdol())
        private fun getZyagPets(): Array<Pet> = arrayOf(Gobankes(), Zyagra(), Zyag(), Panji(), Seokhwakes(), Pangra(), Pangu(), Zyahad())
        private fun getBergaPets(): Array<Pet> = arrayOf(Berga(), Beruru(), Gorugoru(), Norunoru())
        private fun getDainoPets(): Array<Pet> = arrayOf(Daino(), Dainos(), Prakitos(), Stentos(), Pritos())
        private fun getWoopu2DPets(): Array<Pet> = arrayOf(Notutu2D(), Popo2D(), Pututu2D(), Putu2D())
        private fun getWoopuPets(): Array<Pet> = arrayOf(Pupu(), Woopu(), Tutu(), Otutu())
        private fun getDorabysPets(): Array<Pet> = arrayOf(Teragon(), Kargon(), Poibys(), Dorabys(), Putera())
        private fun getKukuruPets(): Array<Pet> = arrayOf(Kuling(), Kukuru(), Poling(), Liski(), Noski(), Laski(), WhiteLing(), Chocoling(), WhiteRabbit())
        private fun getBeronPets(): Array<Pet> = arrayOf(Beron(), Beroroku(), Beroboku(), Beropori(), Beronoku(), Beton(), Benoturi(), Berobadu())
        private fun getGordonPets(): Array<Pet> = arrayOf(Gordon(), Giradon(), Turdon(), Gorgo(), Gramgor(), Kinggor(), Goruba(), Greengor())
        private fun getNegoPets(): Array<Pet> = arrayOf(Agoa(), Negos(), Tarogon(), Dagos(), Bokugon())
        private fun getMuiPets(): Array<Pet> = arrayOf(Rui(), Mui(), Ssibos(), Tui(), Lubos(), Nobos())
        private fun getKkomiPets(): Array<Pet> = arrayOf(Kkomi(), Kkobi(), Kkobio(), Kkokkobi(), Pingkkomi(), Gooda())
        private fun getKakuPets(): Array<Pet> = arrayOf(Kaku(), Baka(), Bau(), Kau())
        private fun getNostorosPets(): Array<Pet> = arrayOf(Barorokus(), Lanberos(), Koritorus(), Nostoros(), Nororokus(), Silbarokus(), Dirorokus(), Jinjutoros())
        private fun getToraPets(): Array<Pet> = arrayOf(Tora(), Perpe(), Karpe(), Syuwoo(), Minis())
        private fun getKakiPets(): Array<Pet> = arrayOf(Taki(), Kuku(), Horku(), Kaki())
        private fun getStorajiPets(): Array<Pet> = arrayOf(Storaji(), Atoraji(), Arinoros(), Dainoros(), Darinos(), Tarnoros(), Arinoros(), Purnoros())
        private fun getPentasPets(): Array<Pet> = arrayOf(Tanopus(), Notas(), Kobals(), Tarpus(), Torinopus(), Pentas(), Torikera(), Toripus())
        private fun getLagogoPets(): Array<Pet> = arrayOf(Lagogo(), Hubaba(), Toruru(), Luni())
        private fun getBoogiPets(): Array<Pet> = arrayOf(Noboogi(), Boogi(), Kkangboogi(), Dolboogi(), Mulboogi(), Kkoboogi(), Cheolboogi(), Kingboogi())
        private fun getDooriPets(): Array<Pet> = arrayOf(Woori(), Doori(), Stainwoori())
        private fun getRarePets(): Array<Pet> = arrayOf(Paaran(), Goruru(), Kingkkomi(), Morax())
        private fun getKeibeePets(): Array<Pet> = arrayOf(Kabit(), Keibee(), Kyuee(), Goldkabit())
        private fun getMonasipuPets(): Array<Pet> = arrayOf(Pwito(), Monasipu(), Lanapu(), Laihon(), Taihon())
        private fun getMarabiaPets(): Array<Pet> = arrayOf(Marabia())
        private fun getGodSnakePets(): Array<Pet> = arrayOf(Bareme(), Burori(), Mameru(), Moyami(), Blacksnake())
        /* 페트 리스트 [End] */

        // 특정 타입 페트 얻기 ( ~류 페트 얻기: 얀기로, 반보로 )
        fun getTypePets(type: PET_TYPE): Array<Pet> = when(type) {
            PET_TYPE.SPECIAL -> getSpecialPets()
            PET_TYPE.FOURGUARDIANSOGDS -> getFourguardiansgodPets()
            PET_TYPE.WEREWOLF -> getWereWolfPets()
            PET_TYPE.BEAST -> getBeastPets()
            PET_TYPE.YANGIRO -> getYangiroPets()
            PET_TYPE.OGAROS -> getOgarosPets()
            PET_TYPE.SAMDUSA -> getSamdusaPets()
            PET_TYPE.HYUBO -> getHyuboPets()
            PET_TYPE.BUBI -> getBubiPets()
            PET_TYPE.KATARKAS -> getKatarkasPets()
            PET_TYPE.MANMO -> getManmoPets()
            PET_TYPE.GIGAROS -> getGigarosPets()
            PET_TYPE.SNAKE -> getSnakePets()
            PET_TYPE.DOG -> getDogPets()
            PET_TYPE.ZYAG -> getZyagPets()
            PET_TYPE.BERGA -> getBergaPets()
            PET_TYPE.DAINO -> getDainoPets()
            PET_TYPE.WOOPU2D -> getWoopu2DPets()
            PET_TYPE.WOOPU -> getWoopuPets()
            PET_TYPE.DORABYS -> getDorabysPets()
            PET_TYPE.KUKURU -> getKukuruPets()
            PET_TYPE.BERON -> getBeronPets()
            PET_TYPE.GORDON -> getGordonPets()
            PET_TYPE.NEGOS -> getNegoPets()
            PET_TYPE.MUI -> getMuiPets()
            PET_TYPE.KKOMI -> getKkomiPets()
            PET_TYPE.KAKU -> getKakuPets()
            PET_TYPE.NOSTOROS -> getNostorosPets()
            PET_TYPE.TORA -> getToraPets()
            PET_TYPE.KAKI -> getKakiPets()
            PET_TYPE.STORAJI -> getStorajiPets()
            PET_TYPE.PENTAS -> getPentasPets()
            PET_TYPE.LAGOGO -> getLagogoPets()
            PET_TYPE.BOOGI -> getBoogiPets()
            PET_TYPE.DOORI -> getDooriPets()
            PET_TYPE.RARE -> getRarePets()
            PET_TYPE.KEIBEE -> getKeibeePets()
            PET_TYPE.MONASIPU -> getMonasipuPets()
            PET_TYPE.MARABIA -> getMarabiaPets()
            PET_TYPE.GODSNAKE -> getGodSnakePets()
        }

        // 특정 타입 페트류 이름 얻기 ( ~류 하위 페트 이름 얻기: 반보로, 얀기로 ... )
        fun getTypePetNames(type: PET_TYPE): Array<CharSequence> {
//            var typePets:Array<Pet> = when(type) {
//                PET_TYPE.SPECIAL -> getSpecialPets()
//                PET_TYPE.FOURGUARDIANSOGDS -> getFourguardiansgodPets()
//                PET_TYPE.WEREWOLF -> getWereWolfPets()
//                PET_TYPE.BEAST -> getBeastPets()
//                PET_TYPE.YANGIRO -> getYangiroPets()
//                PET_TYPE.OGAROS -> getOgarosPets()
//            }
            var typePets:Array<Pet> = getTypePets(type)

            val typePetNames: ArrayList<CharSequence> = ArrayList()
            typePets.forEach { typePetNames.add(it.name) }
            return typePetNames.toTypedArray()
        }
    }
}


