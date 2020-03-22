package best.hyun.pgrc.type.werewolf

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class FireWereWolf : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_firewerewolf)
    override val type: PET_TYPE
        get() = PET_TYPE.WEREWOLF
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_firewerewolf)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 66
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 10
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1567
    override val maxLvMaxAtk: Int
        get() = 396
    override val maxLvMaxDef: Int
        get() = 229
    override val maxLvMaxSpd: Int
        get() = 238
    override val initLvMinHp: Int
        get() = 52
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 8
    override val maxLvMinHp: Int
        get() = 1357
    override val maxLvMinAtk: Int
        get() = 358
    override val maxLvMinDef: Int
        get() = 191
    override val maxLvMinSpd: Int
        get() = 206
    override val minAllGrowth: Double
        get() = 5.263
    override val maxAllGrowth: Double
        get() = 5.970
}