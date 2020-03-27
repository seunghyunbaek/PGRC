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

interface PetAbstractFactory { fun createPetArray(): Array<Pet> }

private class SpecialFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Laiby(), Bokwoori(), Fywable(), Peruru(), Dorudoru(), YongIceDragon(), Kawoo(), Hubaty())
    }
}

private class FourGuardiansGodFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(WhiteTiger(), RedBird(), BlackTortoise(), BlueDragon())
    }
}

private class WereWolfPetFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(EarthWereWolf(), WaterWereWolf(), FireWereWolf(), WindWereWolf())
    }
}

private class BeastFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(EarthHorse(), WaterHorse(), FireHorse(), WindHorse(), MecaEarthHorse(), MecaWaterHorse(), MecaFireHorse(), MecaWindHorse(), EarthMouse(), WaterMouse(), FireMouse(), WindMouse())
    }
}

private class YangiroFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Libino(), Yangiro(), Banboro(), Bangino(), Burudon(), Gibino(), Bino(), Giro(), Boro(), Gino(), Rudon(), Ssagat(), Teinos())
    }
}

private class OgarosFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Ogaros(), Orgon(), Mogaros(), Golos(), Norgon(), Pooryong(), Jigaros(), Kalos())
    }
}

private class SamdusaFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Jidusa(), Sudusa(), Hwadusa(), Poongdusa())
    }
}

private class HyuboFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Hyubo(), Pobo(), Kubo(), Torozya(), Burubo())
    }
}

private class BubiFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Bubi(), GoldBubi(), Bui(), Buibee(), KingBui())
    }
}

private class KatarkasFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Katarkas(), Kukas(), Korokas(), Logian(), Lamgas(), Aikas(), Kutas(), Kargian())
    }
}

private class ManmoFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Manmo(), Manmoru(), Manmonas(), Manmoros())
    }
}

private class GigarosFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Gigaros(), Megaros(), Bitros(), Gagaros(), Teraros())
    }
}

private class SnakeFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(EarthSnake(), WaterSnake(), FireSnake(), WindSnake())
    }
}

private class DogFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Jimung(), MongMong(), Jindol(), Mongdol())
    }
}

private class ZyagFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Gobankes(), Zyagra(), Zyag(), Panji(), Seokhwakes(), Pangra(), Pangu(), Zyahad())
    }
}

private class BergaFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Berga(), Beruru(), Gorugoru(), Norunoru())
    }
}

private class DainoFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Daino(), Dainos(), Prakitos(), Stentos(), Pritos())
    }
}

private class Woopu2DFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Notutu2D(), Popo2D(), Pututu2D(), Putu2D())
    }
}

private class WoopuFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Pupu(), Woopu(), Tutu(), Otutu())
    }
}

private class DorabysFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Teragon(), Kargon(), Poibys(), Dorabys(), Putera())
    }
}

private class KukuruFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Kuling(), Kukuru(), Poling(), Liski(), Noski(), Laski(), WhiteLing(), Chocoling(), WhiteRabbit())
    }
}

private class BeronFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Beron(), Beroroku(), Beroboku(), Beropori(), Beronoku(), Beton(), Benoturi(), Berobadu())
    }
}

private class GordonFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Gordon(), Giradon(), Turdon(), Gorgo(), Gramgor(), Kinggor(), Goruba(), Greengor())
    }
}

private class NegosFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Agoa(), Negos(), Tarogon(), Dagos(), Bokugon())
    }
}

private class MuiFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Rui(), Mui(), Ssibos(), Tui(), Lubos(), Nobos())
    }
}

private class KkomiFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Kkomi(), Kkobi(), Kkobio(), Kkokkobi(), Pingkkomi(), Gooda())
    }
}

private class KakuFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Kaku(), Baka(), Bau(), Kau())
    }
}

private class NostorosFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Barorokus(), Lanberos(), Koritorus(), Nostoros(), Nororokus(), Silbarokus(), Dirorokus(), Jinjutoros())
    }
}

private class ToraFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Tora(), Perpe(), Karpe(), Syuwoo(), Minis())
    }
}

private class KakiFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Taki(), Kuku(), Horku(), Kaki())
    }
}

private class StorajiFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Storaji(), Atoraji(), Arinoros(), Dainoros(), Darinos(), Tarnoros(), Arinoros(), Purnoros())
    }
}

private class PentasFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Tanopus(), Notas(), Kobals(), Tarpus(), Torinopus(), Pentas(), Torikera(), Toripus())
    }
}

private class LagogoFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Lagogo(), Hubaba(), Toruru(), Luni())
    }
}

private class BoogiFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Noboogi(), Boogi(), Kkangboogi(), Dolboogi(), Mulboogi(), Kkoboogi(), Cheolboogi(), Kingboogi())
    }
}

private class DooriFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Woori(), Doori(), Stainwoori())
    }
}

private class RareFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Paaran(), Goruru(), Kingkkomi(), Morax())
    }
}

private class KeibeeFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Kabit(), Keibee(), Kyuee(), Goldkabit())
    }
}

private class MonasipuFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Pwito(), Monasipu(), Lanapu(), Laihon(), Taihon())
    }
}

private class MarabiaFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Marabia())
    }
}

private class GodSnakeFactory: PetAbstractFactory {
    override fun createPetArray(): Array<Pet> {
        return arrayOf(Bareme(), Burori(), Mameru(), Moyami(), Blacksnake())
    }
}

class PetFactory {
    companion object {
        // 모든 페트 종류(타입) 얻기 ( ~~~류 )
        fun getPetTypes(): Array<PET_TYPE> = PET_TYPE.values()

        fun getPetArray(petAbstractFactory: PetAbstractFactory) : Array<Pet> {
            return petAbstractFactory.createPetArray()
        }

        // 특정 타입 페트 얻기 ( ~류 페트 얻기: 얀기로, 반보로 )
        fun getTypePets(type: PET_TYPE): Array<Pet> = when(type) {
            PET_TYPE.SPECIAL -> getPetArray(SpecialFactory())
            PET_TYPE.FOURGUARDIANSOGDS -> getPetArray(FourGuardiansGodFactory())
            PET_TYPE.WEREWOLF -> getPetArray(WereWolfPetFactory())
            PET_TYPE.BEAST -> getPetArray(BeastFactory())
            PET_TYPE.YANGIRO -> getPetArray(YangiroFactory())
            PET_TYPE.OGAROS -> getPetArray(OgarosFactory())
            PET_TYPE.SAMDUSA -> getPetArray(SamdusaFactory())
            PET_TYPE.HYUBO -> getPetArray(HyuboFactory())
            PET_TYPE.BUBI -> getPetArray(BubiFactory())
            PET_TYPE.KATARKAS -> getPetArray(KatarkasFactory())
            PET_TYPE.MANMO -> getPetArray(ManmoFactory())
            PET_TYPE.GIGAROS -> getPetArray(GigarosFactory())
            PET_TYPE.SNAKE -> getPetArray(SnakeFactory())
            PET_TYPE.DOG -> getPetArray(DogFactory())
            PET_TYPE.ZYAG -> getPetArray(ZyagFactory())
            PET_TYPE.BERGA -> getPetArray(BergaFactory())
            PET_TYPE.DAINO -> getPetArray(DainoFactory())
            PET_TYPE.WOOPU2D -> getPetArray(Woopu2DFactory())
            PET_TYPE.WOOPU -> getPetArray(WoopuFactory())
            PET_TYPE.DORABYS -> getPetArray(DorabysFactory())
            PET_TYPE.KUKURU -> getPetArray(KukuruFactory())
            PET_TYPE.BERON -> getPetArray(BeronFactory())
            PET_TYPE.GORDON -> getPetArray(GordonFactory())
            PET_TYPE.NEGOS -> getPetArray(NegosFactory())
            PET_TYPE.MUI -> getPetArray(MuiFactory())
            PET_TYPE.KKOMI -> getPetArray(KkomiFactory())
            PET_TYPE.KAKU -> getPetArray(KakuFactory())
            PET_TYPE.NOSTOROS -> getPetArray(NostorosFactory())
            PET_TYPE.TORA -> getPetArray(ToraFactory())
            PET_TYPE.KAKI -> getPetArray(KakiFactory())
            PET_TYPE.STORAJI -> getPetArray(StorajiFactory())
            PET_TYPE.PENTAS -> getPetArray(PentasFactory())
            PET_TYPE.LAGOGO -> getPetArray(LagogoFactory())
            PET_TYPE.BOOGI -> getPetArray(BoogiFactory())
            PET_TYPE.DOORI -> getPetArray(DooriFactory())
            PET_TYPE.KEIBEE -> getPetArray(KeibeeFactory())
            PET_TYPE.RARE -> getPetArray(RareFactory())
            PET_TYPE.MONASIPU -> getPetArray(MonasipuFactory())
            PET_TYPE.MARABIA -> getPetArray(MarabiaFactory())
            PET_TYPE.GODSNAKE -> getPetArray(GodSnakeFactory())
        }

        // 특정 타입 페트류 이름 얻기 ( ~류 하위 페트 이름 얻기: 반보로, 얀기로 ... )
        fun getTypePetNames(type: PET_TYPE): Array<CharSequence> {
            var typePets:Array<Pet> = getTypePets(type)

            val typePetNames: ArrayList<CharSequence> = ArrayList()
            typePets.forEach { typePetNames.add(it.name) }
            return typePetNames.toTypedArray()
        }
    }
}


