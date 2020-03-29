package best.hyun.pgrc.type.ktarkas

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kargian : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kargian)
    override val type: PET_TYPE
        get() = PET_TYPE.KATARKAS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kargian)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 42
    override val initLvMaxAtk: Int
        get() = 6
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1477
    override val maxLvMaxAtk: Int
        get() = 238
    override val maxLvMaxDef: Int
        get() = 344
    override val maxLvMaxSpd: Int
        get() = 122
    override val initLvMinHp: Int
        get() = 32
    override val initLvMinAtk: Int
        get() = 5
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1252
    override val maxLvMinAtk: Int
        get() = 198
    override val maxLvMinDef: Int
        get() = 304
    override val maxLvMinSpd: Int
        get() = 88
    override val minAllGrowth: Double
        get() = 4.179
    override val maxAllGrowth: Double
        get() = 4.942
}